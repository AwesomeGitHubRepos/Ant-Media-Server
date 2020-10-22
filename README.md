[![Build Status](https://travis-ci.org/ant-media/Ant-Media-Server.svg?branch=master)](https://travis-ci.org/ant-media/Ant-Media-Server) 
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.antmedia/ant-media-server/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.antmedia/ant-media-server)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=io.antmedia%3Aant-media-server&metric=alert_status)](https://sonarcloud.io/dashboard?id=io.antmedia%3Aant-media-server)

### 2037 Running Instances in 111 Countries at 09:33 AM GMT on July 21, 2020


Ant Media Server 
====

Ant Media Server is an open source media server that supports:

 * Ultra Low Latency Adaptive One to Many WebRTC Live Streaming in **Enterprise Edition**
 * Adaptive Bitrate for Live Streams (WebRTC, MP4, HLS) in **Enterprise Edition**
 * VP8 & H264 Support in WebRTC **Enterprise Edition**
 * Data Channel Support in WebRTC **Enterprise Editio** 
 * Horizontal(Clustering) and Vertical Scaling **Enterprise Edition**
 * SFU in One to Many WebRTC Streams in **Enterprise Edition**
 * Live Stream Publishing from RTMP to WebRTC **Enterprise Edition**
 * RTMP Ingesting
 * WebRTC to RTMP Adapter
 * IP Camera Support
 * Recording Live Streams (MP4 and HLS)
 * Restream to Social Media Simultaneously(Facebook and Youtube in **Enterprise Edition**)
 * One-Time Token Control in **Enterprise Edition**
 * Object Detection in **Enterprise Edition**
 
 [Comparison table for Community and Enterprise Edition](https://github.com/ant-media/Ant-Media-Server/wiki#community-edition--enterprise-edition)
 
## Quick Launch
 
<b>Launch in [Amazon Web Services](https://aws.amazon.com/marketplace/search/results?x=0&y=0&searchTerms=Ant+Media+Server&page=1&ref_=nav_search_box)</b>

 <a href="https://aws.amazon.com/marketplace/search/results?x=0&y=0&searchTerms=Ant+Media+Server&page=1&ref_=nav_search_box"><img src="https://i1.wp.com/antmedia.io/wp-content/uploads/2019/06/1200px-Amazon_Web_Services_Logo.svg-300x180.png" width=90/></a>
 
<b>Launch in [Microsoft Azure](https://azuremarketplace.microsoft.com/en-us/marketplace/apps?search=Ant%20Media%20Server&page=1)</b> (Wait a few seconds for listings appear)
  
 <a href="https://azuremarketplace.microsoft.com/en-us/marketplace/apps?search=Ant%20Media%20Server&page=1"><img src="https://i1.wp.com/antmedia.io/wp-content/uploads/2019/01/azure-e1548153434609.png" width=130/></a>
 
 
 ### Links
 
 * [Documentation](http://docs.antmedia.io/) 
 * [Web site](https://antmedia.io)
 * [Community Edition vs. Enterprise Edition](https://github.com/ant-media/Ant-Media-Server/wiki#community-edition--enterprise-edition)
 

## Releases

### [Ant Media Server Community 2.2.0 (Oct 21, 2020)](https://github.com/ant-media/Ant-Media-Server/releases/download/ams-v2.2.0/ant-media-server-2.2.0-community-2.2.0-20201021_1516.zip) 

Changelog - including Enterprise Edition
- Support CMAF in DASH https://github.com/ant-media/Ant-Media-Server/issues/2471, https://github.com/ant-media/Ant-Media-Server/issues/2440
- Update from Java 8 to Java 11 https://github.com/ant-media/Ant-Media-Server/issues/2394, https://github.com/ant-media/Ant-Media-Server/issues/2458
- Tomcat performance improvement with APR and SSL https://github.com/ant-media/Ant-Media-Server/issues/2525
- Support Kubernetes https://github.com/ant-media/Ant-Media-Server/issues/2390, https://github.com/ant-media/Ant-Media-Server/pull/2464
-  Create REST method equivalent of WebSocket's getRoomInfo https://github.com/ant-media/Ant-Media-Server/issues/2463, https://github.com/ant-media/Ant-Media-Server/issues/2596
-  Update default STUN server https://github.com/ant-media/Ant-Media-Server/issues/2472
-  Tomcat version is updated to 8.5.58 https://github.com/ant-media/Ant-Media-Server/issues/2447
-  Support custom resolutions from WebRTC to RTMP in Community Edition https://github.com/ant-media/Ant-Media-Server/issues/2485
- Fix number of Viewers decrease less than zero https://github.com/ant-media/Ant-Media-Server/pull/2438
- HLS token problem in Cluster https://github.com/ant-media/Ant-Media-Server/pull/2432
- Support WebRTC and HLS Viewer Limit in Broadcasts https://github.com/ant-media/Ant-Media-Server/issues/2389

 [Full ChangeLog](https://github.com/ant-media/Ant-Media-Server/releases/tag/ams-v2.2.0) 


### [Ant Media Server Community 2.1.0 (July 20, 2020)](https://github.com/ant-media/Ant-Media-Server/releases/download/ams-v2.1.0/ant-media-server-2.1.0-community-2.1.0-20200720_1340.zip) 

Features
* H265 Transcoding from RTMP to WebRTC [#2058](https://github.com/ant-media/Ant-Media-Server/issues/2058)
* WebM Recording [#2144](https://github.com/ant-media/Ant-Media-Server/issues/2144)
* Force WebRTC Player to play at specified resolution [#2155](https://github.com/ant-media/Ant-Media-Server/issues/2155)
* Create a websocket message that returns the available streams in the conference room [#2227](https://github.com/ant-media/Ant-Media-Server/issues/2227)
* Create a websocket message that notifies client that if bandwidth is less than the video/audio bitrate [#2103](https://github.com/ant-media/Ant-Media-Server/issues/2103)
* Check broadcast start and end time before accepting the WebRTC Stream [#2181](https://github.com/ant-media/Ant-Media-Server/issues/2181)
* Update video.js to the latest version for HLS and MP4 playback [#2231](https://github.com/ant-media/Ant-Media-Server/issues/2231)
* Create a REST method that can send message to the viewers through Data channel [#2026](https://github.com/ant-media/Ant-Media-Server/issues/2026)

 [Full ChangeLog](https://github.com/ant-media/Ant-Media-Server/releases/tag/ams-v2.1.0) 

### [Ant Media Server Community 2.0.0 (May 4, 2020)](https://github.com/ant-media/Ant-Media-Server/releases/download/ams-v2.0.0/ant-media-server-2.0.0-community-2.0.0-20200504_1842.zip)
* VP8 Support in Playing, Ingesting, Transcoding and Clustering [#1816](https://github.com/ant-media/Ant-Media-Server/issues/1816) [#1962](https://github.com/ant-media/Ant-Media-Server/issues/1962) [#2013](https://github.com/ant-media/Ant-Media-Server/issues/2013) [#1994](https://github.com/ant-media/Ant-Media-Server/issues/1994) 
* Data Channel Support in Playing, Ingesting, Clustering [#1737](https://github.com/ant-media/Ant-Media-Server/issues/1737) [#2004](https://github.com/ant-media/Ant-Media-Server/issues/2004) [#2011](https://github.com/ant-media/Ant-Media-Server/issues/2001) [#2045](https://github.com/ant-media/Ant-Media-Server/issues/2045) [#1866](https://github.com/ant-media/Ant-Media-Server/issues/1866) 
* 4K 60 FPS RTMP -> WebRTC Streaming Support [#1854](https://github.com/ant-media/Ant-Media-Server/issues/1854) [#1867](https://github.com/ant-media/Ant-Media-Server/issues/1867) [#1759](https://github.com/ant-media/Ant-Media-Server/issues/1759) [#1775](https://github.com/ant-media/Ant-Media-Server/issues/1775)
* WebRTC Stack is updated to WebRTC M79 [#1818](https://github.com/ant-media/Ant-Media-Server/issues/1818) [#1838](https://github.com/ant-media/Ant-Media-Server/issues/1838) [#1827](https://github.com/ant-media/Ant-Media-Server/issues/1827) 
* Official Ubuntu 18.04 support [#1655](https://github.com/ant-media/Ant-Media-Server/issues/1655)
* Cluster Monitoring Support [#1897](https://github.com/ant-media/Ant-Media-Server/issues/1897) 

 [Full ChangeLog](https://github.com/ant-media/Ant-Media-Server/releases/tag/ams-v2.0.0) 


Previous releases
https://github.com/ant-media/Ant-Media-Server/releases/

## Contact 

 For more information and blog posts visit [antmedia.io](https://antmedia.io)
 
 [contact@antmedia.io](mailto:contact@antmedia.io)
 

