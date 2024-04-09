package io.antmedia.valves;

import java.io.IOException;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.valves.ValveBase;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import io.antmedia.AppSettings;
import io.antmedia.filter.TokenFilterManager;
import io.antmedia.logger.LoggerUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.HttpMethod;

/**
 * This class just logs the data transfered for http requests to 
 * @author mekya
 *
 */
public class DataTransferValve extends ValveBase {

	@Override
	public void invoke(Request request, Response response) throws IOException, ServletException {

		getNext().invoke(request, response);
		
		String streamId = TokenFilterManager.getStreamId(request.getRequestURI());
		String method = request.getMethod();

		if (StringUtils.isNotBlank(streamId) && (HttpMethod.GET.equals(method) || HttpMethod.HEAD.equals(method))) 
		{
			String tokenId = ((HttpServletRequest) request).getParameter("token");
			String subscriberId = ((HttpServletRequest) request).getParameter("subscriberId");

			if (subscriberId != null) {
				subscriberId = subscriberId.replaceAll(TokenFilterManager.REPLACE_CHARS_REGEX, "_");
			}
			

			String sessionId = request.getSession().getId();

			String clientIP = request.getRemoteAddr().replaceAll(TokenFilterManager.REPLACE_CHARS_REGEX, "_");

			long bytesWritten = response.getBytesWritten(false);
			
			ConfigurableWebApplicationContext context = (ConfigurableWebApplicationContext) request.getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);

			AppSettings appSettings = (AppSettings) context.getBean(AppSettings.BEAN_NAME);
			LoggerUtils.logAnalyticsFromServer(appSettings.getAppName(), "dataTransfer", 
											LoggerUtils.STREAM_ID_FIELD, streamId,
											LoggerUtils.URI_FIELD, request.getRequestURI(),
											LoggerUtils.SUBSCRIBER_ID_FIELD, subscriberId,
											LoggerUtils.CLIENT_IP_FIELD, clientIP,
											LoggerUtils.SESSION_ID_FIELD, sessionId,
											LoggerUtils.BYTE_TRANSFERRED, Long.toString(bytesWritten));

			
		}
	}

}
