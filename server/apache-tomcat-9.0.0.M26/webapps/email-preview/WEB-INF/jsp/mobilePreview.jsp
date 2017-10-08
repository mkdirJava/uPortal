<%--

    Licensed to Apereo under one or more contributor license
    agreements. See the NOTICE file distributed with this work
    for additional information regarding copyright ownership.
    Apereo licenses this file to you under the Apache License,
    Version 2.0 (the "License"); you may not use this file
    except in compliance with the License.  You may obtain a
    copy of the License at the following location:

      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied.  See the License for the
    specific language governing permissions and limitations
    under the License.

--%>
<jsp:directive.include file="/WEB-INF/jsp/include.jsp"/>

<c:set var="includeJQuery" value="${renderRequest.preferences.map['includeJQuery'][0]}"/>
<c:if test="${includeJQuery}">
    <script src="<rs:resourceURL value="/rs/jquery/1.8.3/jquery-1.8.3.min.js"/>" type="text/javascript"></script>
    <script src="<rs:resourceURL value="/rs/jqueryui/1.7.2/jquery-ui-1.7.2-v2.min.js"/>" type="text/javascript"></script>
</c:if>
<script src="<rs:resourceURL value="/rs/fluid/1.1.3/js/fluid-all-1.1.3.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/js/batched-pager.js"/>" type="text/javascript"></script>
<script src="<c:url value="/js/email-browser.js"/>" type="text/javascript"></script>

<link type="text/css" rel="stylesheet" href="<c:url value="/css/jquery.mobile.structure-1.1.1.min.css"/>" media="screen, projection"/>
<link type="text/css" rel="stylesheet" href="<c:url value="/css/emailMobile.css"/>" media="screen, projection"/>
<link type="text/css" rel="stylesheet" href="<c:url value="/css/email.min.css"/>"/>

<c:set var="n"><portlet:namespace/></c:set>
<portlet:resourceURL id="accountSummary" var="accountSummaryUrl" />
<portlet:actionURL var="showRollupUrl" windowState="normal">
    <portlet:param name="action" value="showRollup"/>
</portlet:actionURL>
<portlet:resourceURL id="emailMessage" var="messageUrl" />
<portlet:resourceURL id="deleteMessages" var="deleteUrl" />
<portlet:resourceURL id="toggleSeen" var="toggleSeenUrl" />
<portlet:resourceURL id="updatePageSize" var="updatePageSizeUrl" />
<portlet:resourceURL id="inboxFolder" var="inboxFolderUrl" />

<c:if test="${showConfigLink}">
    <portlet:renderURL var="configUrl" portletMode="CONFIG"/>
    <p style="text-align: right;"><a href="${ configUrl }">Configure portlet</a></p>
</c:if>
<div class="email-preview">
<div data-role="content" id="${n}container" class="email-container portlet" xmlns:rsf="http://ponder.org.uk">
    <div class="loading-message"></div>
    <div class="error-message portlet-msg-error portlet-msg error" role="alert" style="display:none">
        <p id="error-text"></p>
        <c:if test="${supportsEdit}">
            <p><spring:message code="preview.errorMessage.changePreferences.preLink"/> <a href="<portlet:renderURL portletMode="EDIT"/>"><spring:message code="preview.errorMessage.changePreferences.linkText"/></a> <spring:message code="preview.errorMessage.changePreferences.postLink"/></p>
        </c:if>
    </div>

    <div class="email-list" style="display:none;">

        <form name="inboxForm">
        	<div data-role="navbar" class="ui-body-a">
        	  <ul>
                <li><a data-icon="check" data-iconpos="top" class="inbox-link" href="" target="_blank"><spring:message code="preview.toolbar.inbox"/></a></li>
                <li><a data-icon="refresh" data-iconpos="top" class="refresh-link email-action-link" href="javascript:;"><spring:message code="preview.toolbar.refresh"/></a></li>
                <c:if test="${allowDelete}">             
                	<li><a data-icon="delete" data-iconpos="top" class="delete-link email-action-link" href="javascript:;"><span><spring:message code="preview.toolbar.deleteSelected"/></span></a></li>
                </c:if>  
                <li id="mobileSelect">
	                <label for="results"><spring:message code="preview.pager.perPage"/></label>
	                <select id="results" data-mini="true"  class="pager-page-size flc-pager-page-size">
	                    <option value="5">5</option>
	                    <option value="10">10</option>
	                    <option value="20">20</option>
	                    <option value="50">50</option>
	                </select>
                </li>
               </ul>

            </div>

            <div class="flc-pager-top">
                <div class="styled-select" data-role="fieldcontain">
                    <!-- label for="allFolders"><spring:message code="preview.inboxFolder.choose"/></label-->
                    <select id="allFolders" name="allFolders">
                    </select>
                </div>             
                <ul id="pager-top" class="fl-pager-ui">
                    <li class="flc-pager-previous"><a href="javascript:;">&lt; <spring:message code="preview.pager.previous"/></a></li>
                    <li>
                        <ul class="fl-pager-links flc-pager-links">
                            <li class="flc-pager-pageLink"><a  href="javascript:;">1</a></li>
                            <li class="flc-pager-pageLink-disabled">2</li>
                            <li class="flc-pager-pageLink-skip">...</li>
                            <li class="flc-pager-pageLink"><a href="javascript:;">3</a></li>
                        </ul>
                    </li>
                    <li class="flc-pager-next"><a href="javascript:;" ><spring:message code="preview.pager.next"/> &gt;</a></li>
                </ul>
            </div>
          	<div class="message_stats"><span class="unread-message-count"></span> <spring:message code="preview.toolbar.unreadMessages"/>
          	<span class="stats"><strong><spring:message code="common.quota"/>: </strong><span class="email-quota-usage"></span> / <span class="email-quota-limit"></span></span>
          	</div>
            <div class="message_infos">
                <ul rsf:id="row:" class="email-row"  data-role="listview" >
                    <li>
	                    <span rsf:id="flags" class="flags"><p class="answered-span">&nbsp;</p></span>
	                    <span rsf:id="attachments" class="flags"><p class="attached-span">&nbsp;</p></span>
	                    <h3 rsf:id="subject"><a href="javascript:;" class="subject"></a></h3><p rsf:id="sender" class="sender"></p><p rsf:id="sentDate" class="sentDate"></p>
	                    <p rsf:id="select" class="select"></p>
                    </li>
                </ul>
            </div>
        </form>
    </div>

    <div class="email-message" style="display:none">
        <ul cellpadding="0" cellspacing="0" class="message-headers">
            <li><span class="message-header-name"><spring:message code="preview.message.from"/></span><span class="from"></span></li>
            <li><span class="message-header-name"><spring:message code="preview.message.subject"/></span><span class="subject"></span></li>
            <li><span class="message-header-name"><spring:message code="preview.message.date"/></span><span class="sentDate"></span></li>
			<li><span class="message-header-name"><spring:message code="preview.message.to"/></span><span class="toRecipients"></span></li>
            <li class="ccInfo"><span class="message-header-name"><spring:message code="preview.message.cc"/></span><span class="ccRecipients"></span></li>
            <li class="bccInfo"><span class="message-header-name"><spring:message code="preview.message.bcc"/></span><span class="bccRecipients"></span></li>
        </ul>
        <hr/>
		<p class="pager-msg">        
			<span class="previous-msg"><a data-role="button" data-icon="arrow-l" data-mini="true" data-inline="true" href="javascript:;"><spring:message code="preview.pager.previous"/></a></span>
	 		<span class="next-msg"><a data-role="button" data-icon="arrow-r" data-iconpos="right" data-mini="true" data-inline="true" href="javascript:;"><spring:message code="preview.pager.next"/></a></span>
 		</p>          
        <p><a class="return-link" data-role="button" data-icon="back" data-mini="true" href="javascript:;"><spring:message code="preview.message.returnToMessages"/></a></p>
        <div class="message-content">
        </div>
        <form name="messageForm">
            <input class="message-uid" type="hidden" name="selectMessage" value=""/>
            <p><a class="return-link" data-role="button" data-icon="back" data-mini="true" href="javascript:;"><spring:message code="preview.message.returnToMessages"/></a></p>
            <c:if test="${allowDelete}">
                <input class="delete-message-button" data-icon="delete" data-iconpos="top" data-mini="true" type="button" value=" <spring:message code="preview.message.delete"/> "/>
            </c:if>
            <c:if test="${supportsToggleSeen}">
                <input class="mark-read-button" data-icon="check" data-iconpos="top" data-mini="true" type="button" value=" <spring:message code="preview.message.markRead"/> " style="display: none;"/>
                <input class="mark-unread-button" data-icon="minus" data-iconpos="top" data-mini="true" type="button" value=" <spring:message code="preview.message.markUnread"/> " style="display: none;"/>
            </c:if>
        </form>
    </div>
</div>
</div>

<script type="text/javascript">

    var ${n} = {};
    ${n}.jQuery = jQuery<c:if test="${ includeJQuery }">.noConflict(true)</c:if>;
    ${n}.fluid = fluid;
    fluid = null;
    fluid_1_1 = null;

    ${n}.jQuery(function() {
        var $ = ${n}.jQuery;
        var fluid = ${n}.fluid;

        // Notify the server of changes to pageSize so they can be remembered
        var updatePageSize = function(newPageSize) {
            $.post("${updatePageSizeUrl}", {newPageSize: newPageSize});
        };

        var jsErrorMessages = {
            <c:forEach items="${jsErrorMessages}" var="entry" varStatus="status">
                '${entry.key}': '<spring:message code="${entry.value}"/>'<c:if test="${!status.last}">,</c:if>
            </c:forEach>
        };

        var jsMessages = {
            <c:forEach items="${jsMessages}" var="entry" varStatus="status">
                '${entry.key}': '<spring:message code="${entry.value}"/>'<c:if test="${!status.last}">,</c:if>
            </c:forEach>
        };

        var options = {
        	inboxFolderUrl: "${inboxFolderUrl}",
            accountSummaryUrl: "${accountSummaryUrl}",
            messageUrl: "${messageUrl}",
            messagesInfoContainer: "${messagesInfoContainer}",
            deleteUrl: "${deleteUrl}",
            toggleSeenUrl: "${toggleSeenUrl}",
            pageSize: <c:out value="${pageSize}"/>,
            listeners: {
                initiatePageSizeChange: updatePageSize
            },
            jsErrorMessages: jsErrorMessages,
            jsMessages: jsMessages,
            allowRenderingEmailContent: <c:out value="${allowRenderingEmailContent ? 'true' : 'false'}"/>,
            markMessagesAsRead: <c:out value="${markMessagesAsRead ? 'true' : 'false'}"/>
        };
        // Initialize the display asynchronously
        setTimeout(function() {
            jasig.EmailBrowser("#${n}container", options);
        }, 1);

    });

</script>
