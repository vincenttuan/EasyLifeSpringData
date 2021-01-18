<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!doctype html>
<html lang="en">
    <head>
        <!-- Head -->
        <%@include file="include/head.jspf"  %>
    </head>
    <body style="padding: 10px">

        <div id="layout">
            <!-- Toggle -->
            <%@include file="include/toggle.jspf"  %>

            <!-- Menu -->
            <%@include file="include/menu.jspf"  %>

            <div id="main">
                <div class="header">
                    <h1>Store Group</h1>
                </div>
                <table class="pure-table" style="border: none;">
                    <td valign="top">
                        <!-- 表單 -->
                        <form:form class="pure-form" 
                                   modelAttribute="storeGroup" 
                                   method="POST" 
                                   action="${pageContext.request.contextPath}/mvc/store_group/" >
                            <fieldset>
                                <legend>User form</legend>
                                <form:input path="id" readonly="true" /><p />
                                <form:input path="name" placeholder="請輸入StoreGroup名稱" /><p />
                                <input type="text" id="_method" name="_method"  readonly="true" value="${ _method }" /><p />
                                <button type="submit" class="pure-button pure-button-primary">Submit</button>
                                <button type="reset"
                                        onclick="location.href = '${ pageContext.servletContext.contextPath }/mvc/store_group/'"
                                        class="pure-button pure-button-primary">Reset</button>
                            </fieldset>

                        </form:form>
                    </td>
                    <td valign="top">
                        <!-- 列表 -->
                        <form class="pure-form">
                            <fieldset>
                                <legend>Store Group list</legend>
                                <table class="pure-table pure-table-bordered" width="100%">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Name</th>
                                            <th>Update</th>
                                            <th>Delete</th>
                                        </tr>
                                    </thead>

                                    <tbody>
                                        <c:forEach var="sg" items="${ storeGroups }">
                                            <tr>
                                                <td>${ sg.id }</td>
                                                <td>${ sg.name }</td>
                                                <td><a href="${ pageContext.servletContext.contextPath }/mvc/store_group/${ sg.id }">Update</a></td>
                                                <td><a href="${ pageContext.servletContext.contextPath }/mvc/store_group/delete/${ sg.id }">Delete</a></td>
                                            </tr>
                                        </c:forEach>

                                    </tbody>
                                </table> 
                            </fieldset>
                        </form>
                    </td>
                </table>   


            </div>
        </div>

        <!-- Foot -->
        <%@include file="include/foot.jspf"  %>

    </body>
</html>