<#include "/WEB-INF/freemarker/include/imports.ftl">
<h2>Featured News</h2>
<#if pageable??>

        <#list pageable.items as item>
            <@hst.link var="link" hippobean=item/>
            <ul class=" ">

                <li class="title"><a href="${link}">${item.title}</a></li>
            </ul>
        </#list>

</#if>