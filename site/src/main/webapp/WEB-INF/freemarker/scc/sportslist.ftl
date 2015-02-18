<#include "/WEB-INF/freemarker/include/imports.ftl">
<h2>Sports List</h2>
<#if pageable??>
<div class="yui-main">
    <div id="content" class="yui-b left-and-right">

        <div id="products">
            <#list pageable.items as item>
                <@hst.link var="link" hippobean=item/>
                <ul class="product-item">
                    <#if item.images?? && item.images[0].small??>
                        <@hst.link var="img" hippobean=item.images[0].small />
                        <li class="image">
                            <a href="${link}"><img src="${img}" alt="${item.name}" /></a>
                        </li>
                    </#if>
                    <li class="title"><a href="${link}">${item.name}</a></li>
                <#--<li class="rating stars-0"><a href="products-detail.html">0.0</a></li>-->
                    <li class="description">${item.desc}</li>
                </ul>
            </#list>
        </div>
        <#if pageable.showPagination>
            <#include "/WEB-INF/freemarker/include/pagination.ftl">
        </#if>
    </div>
</div>
</#if>