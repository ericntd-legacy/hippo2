<#include "/WEB-INF/freemarker/include/imports.ftl">
<h2>Sports Page</h2>
<#if document??>
    <@hst.link var="link" hippobean=document/>
<div class="yui-main">
    <div id="content" class="yui-b left-and-right">
        <div>
            <@hst.cmseditlink hippobean=document/>
            <h2>${document.title}</h2>
            <div id="product" class="product-item">
                <#if document.images??>
                    <div class="clear">
                        <ul id="gallery">
                            <#list document.images as item>
                                <@hst.link var="img" hippobean=item/>
                                <li>
                                    <img src="${img}" alt="${item.fileName}" />
                                </li>
                            </#list>
                        </ul>
                    </div>
                </#if>
                <#if document.date??>
                    <span class="date"><@fmt.formatDate value=document.date.time type="both" dateStyle="medium" timeStyle="short"/></span>
                </#if>
                <p class="info">
                    <span class="price"><@fmt.formatNumber value="${document.price}" type="currency" /></span><span class="seperator"><#-- | </span> <span class="rating stars-0">0.0</span>-->
                </p>
                <div class="yui-cssbase body">
                    <div id="editable_cont" class="inline-editor-editable-container">
                        <span class="" id="hippogogreen:summary">${document.introduction}</span> <span
                            class=" inline" id="hippogogreen:description">
                        <@hst.html hippohtml=document.description/>
                    </span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</#if>