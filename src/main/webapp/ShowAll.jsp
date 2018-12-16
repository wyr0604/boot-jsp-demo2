<%@page contentType="text/html; UTF-8" pageEncoding="utf-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html>
<body>
        <table id="tbody" class="table">
            <tr class="table_header">
                <td>
                    ID
                </td>
                <td>
                    Name
                </td>
                <td>
                    email
                </td>
                <td>
                    birthday
                </td>
            </tr>
            <c:forEach varStatus="obj" var="user" items="${requestScope.list}">
                <tr>
                    <td>
                            ${user.tid}
                    </td>
                    <td>
                            ${user.tname}
                    </td>
                    <td>
                            ${user.email}
                    </td>
                    <td>
                            ${user.birthday}
                    </td>
                </tr>

            </c:forEach>

        </table>


    </body>
</html>
