<#include "/WEB-INF/freemarker/include/imports.ftl">

<h2>Promotions</h2>
<#if promotions??>
<#list promotions as item>
    <@hst.link var="link" hippobean=item/>
<li>
    <a href="${link}">${item.name}</a>
</li>
</#list>
</ul>
</#if>