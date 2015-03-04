<#include "/WEB-INF/freemarker/include/imports.ftl">
<h5>gallery</h5>
${document}
<#if result??>
<p>${result.count}</p>
</#if>
<ul id="images">
<#list result.items as item>
    <@hst.link var="img" hippobean=item/>
    <li>
        <img src="${img}" alt="${item.fileName}" />
    </li>
</#list>
</ul>