<#include "/WEB-INF/freemarker/include/imports.ftl">

<h2>Latest events</h2>
<ul>

<#list events as item>
    <@hst.link var="link" hippobean=item/>
    <li>
        <a href="${link}">${item.title}</a>
    </li>
</#list>
</ul>