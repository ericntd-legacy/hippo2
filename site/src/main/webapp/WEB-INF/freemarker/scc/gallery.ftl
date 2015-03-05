<#include "/WEB-INF/freemarker/include/imports.ftl">
<h5>gallery</h5>

<#if images??>
<p>${images?size}</p>
</#if>
<ul id="images">
<#list images as item>
    <@hst.link var="img" hippobean=item/>
    <li>
        <img src="${img}" alt="${item.fileName}" />
    </li>
</#list>
</ul>