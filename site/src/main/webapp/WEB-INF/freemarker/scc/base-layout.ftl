<!doctype html>
<#--
  Copyright 2014 Hippo B.V. (http://www.onehippo.com)

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
-->
<#include "/WEB-INF/freemarker/include/imports.ftl">
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <link rel="stylesheet" href="<@hst.link  path="/css/bootstrap.css"/>"
          type="text/css"/>
<@hst.defineObjects/>
<#if hstRequest.requestContext.cmsRequest>
    <link rel="stylesheet" href="<@hst.link  path="/css/cms-request.css"/>" type="text/css"/>
</#if>
    <link rel="stylesheet" href="<@hst.link  path="/css/jasny-bootstrap.css"/>"
          type="text/css"/>
    <link rel="stylesheet" href="<@hst.link  path="/css/style.css"/>" type="text/css"/>
<@hst.headContributions categoryIncludes="htmlHead" xhtml=true/>
</head>
<body>
<div class="navmenu navmenu-default navmenu-fixed-right offcanvas-sm hidden-md hidden-lg"
     desc="this side nav menu only shows when toggled">
    <!-- <a class="navmenu-brand visible-md visible-lg" href="#">SCC 3</a> -->
    <ul class="nav navmenu-nav">
        <li class="active"><a href="./">Home</a></li>
        <li><a href="./">Membership</a></li>
        <li><a href="../navmenu-push/">Facilities</a></li>
        <li><a href="../navmenu-reveal/">Sports</a></li>
        <li><a href="../navbar-offcanvas/">Social Events</a></li>
        <!-- </ul>
        <ul class="nav navmenu-nav"> -->
        <li><a href="#">F&amp;B</a></li>
        <li><a href="#">Contact</a></li>
        <li><a href="#">Career</a></li>
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Gallery <b class="caret"></b></a>
            <ul class="dropdown-menu navmenu-nav">
                <li><a href="#">Sports</a></li>
                <li class="divider"></li>
                <li><a href="#">Social Events</a></li>
            </ul>
        </li>
    </ul>
</div>
<div class="navbar navbar-default navbar-fixed-top hidden-md hidden-lg" style="z-index:1050">
    <button type="button" class="navbar-toggle visible-sm visible-xs" data-toggle="offcanvas" data-target=".navmenu">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="#">SCC 2</a>
</div>
<div class="container">
    <div class="navbar navbar-fixed-top container" desc="Static navbar">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">SCC 1</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse" desc="navigation menu">
        <#--<ul class="nav navbar-nav">-->
                <#--<li class="active"><a href="./">Home</a></li>-->
                <#--<li><a href="./">Membership</a></li>-->
                <#--<li><a href="../navmenu-push/">Facilities</a></li>-->
                <#--<li><a href="../navmenu-reveal/">Sports</a></li>-->
                <#--<li><a href="../navbar-offcanvas/">Social Events</a></li>-->
            <#--</ul>-->
            <#--<ul class="nav navbar-nav">-->
                <#--<li><a href="#">F&amp;B</a></li>-->
                <#--<li><a href="#">Contact</a></li>-->
                <#--<li><a href="#">Career</a></li>-->
                <#--<li class="dropdown">-->
                    <#--<a href="#" class="dropdown-toggle" data-toggle="dropdown">GalleryComponent <b class="caret"></b></a>-->
                    <#--<ul class="dropdown-menu navmenu-nav">-->
                        <#--<li><a href="#">Sports Events</a></li>-->
                        <#--<li class="divider"></li>-->
                        <#--<li><a href="#">Social Events</a></li>-->
                    <#--</ul>-->
                <#--</li>-->
            <#--</ul>-->
            <@hst.include ref="menu"/>
        </div>
    </div>
    <!-- Main component for a primary marketing message or call to action -->
    <div class="jumbotron">
        <div class="row">
        <@hst.include ref="main"/>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 1</p></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 2</p></div>
            <div class="clearfix visible-sm-block"></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 3</p></div>
            <div class="clearfix visible-md-block"></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 4</p></div>
            <div class="clearfix visible-lg-block"></div>
            <div class="clearfix visible-sm-block"></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 5</p></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 6</p></div>
            <div class="clearfix visible-sm-block"></div>
            <div class="clearfix visible-md-block"></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 7</p></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 8</p></div>
            <div class="clearfix visible-lg-block"></div>
            <div class="clearfix visible-sm-block"></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 9</p></div>
            <div class="clearfix visible-md-block"></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 10</p></div>
            <div class="clearfix visible-sm-block"></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 11</p></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 12</p></div>
        </div>
    </div>
</div>

<#--<div class="container">-->
<#--<div class="row">-->
<#--<div class="col-md-6 col-md-offset-3">-->
<#--<@hst.include ref="top"/>-->
<#--<@hst.include ref="menu"/>-->
<#--</div>-->
<#--</div>-->
<#--<div class="row">-->
<#--<@hst.include ref="main"/>-->
<#--</div>-->
<#--<div class="row">-->
<#--<@hst.include ref="footer"/>-->
<#--</div>-->
<#--</div>-->
<@hst.headContributions categoryIncludes="htmlBodyEnd" xhtml=true/>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<@hst.link  path="/js/bootstrap.min.js"/>"></script>
<script src="<@hst.link  path="/js/jasny-bootstrap.min.js"/>"></script>
<script src="<@hst.link  path="/js/offcanvas.js"/>"></script>

<!-- Grunt live reload -->
<script src="http://localhost:35729/livereload.js"></script>
</body>
</html>