<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>托管所管理系统</title>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="Style/Style.css" rel="stylesheet" type="text/css" />
</head>
<script language="JavaScript">


function mycheck(){
   if(isNull(form1.Teacher_Username.value)){  
   alert("请输入用户名！"); 
   return false;
   }
   if (document.form1.Teacher_Password.value != document.form1.Teacher_Password2.value) { 
   alert("您两次输入的新密码不一致！请重新输入！"); 
   return false; 
   }  
   if(isNull(form1.Teacher_Name.value)){
   alert("请输入姓名！");
   return false;
   }
   if(isNull(form1.Teacher_Sex.value)){
   alert("请选择性别！");
   return false;
   }
   if(isNull(form1.Teacher_Tel.value)){
   alert("请输入联系电话！");
   return false;
   }
}

function isNull(str){
if ( str == "" ) return true;
var regu = "^[ ]+$";
var re = new RegExp(regu);
return re.test(str);
}
   
   
</script>
<body>
<center>
  <table width="900" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td height="60" bgcolor="#E6F5FF" style="color:#06F; font-size:19px; font-weight:bolder; padding-left:50px;">托管所管理系统</td>
    </tr>
    <tr>
      <td height="30" background="Images/MenuBg.jpg">&nbsp;</td>
    </tr>
    <tr>
      <td height="500" align="center" valign="top"><table width="900" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="191" height="500" align="center" valign="top" background="Images/leftbg.jpg">
          <%@ include file="/Left.jsp"%>
          </td>
          <td width="709" align="center" valign="top" bgcolor="#F6F9FE"><table width="709" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td height="30" background="Images/mainMenuBg.jpg" style="padding-left:25px;">修改楼宇管理员</td>
            </tr>
            <tr>
              <td height="470" align="center" valign="top" bgcolor="#F6F9FE"><form name="form1" method="post" action="RosterManagerUpdateSave.action" onSubmit="return mycheck()" >
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="33%" height="30" align="right">&nbsp;</td>
                    <td width="67%"><input name="studentId" type="text" class="noshow" id="studentId" value="<s:property value='rb.studentId'/>"></td>
                  </tr>
                  <tr>
                    <td height="30" align="right"><span style="color:red;">*</span>学生姓名：</td>
                    <td><input name="studentname" type="text" class="text2" id="studentname" value="<s:property value='rb.studentname'/>"></td>
                  </tr>
                  <tr>
                    <td height="30" align="right"><span style="color:red;">*</span>性别：</td>
                    <td>
	                    <select name="sex" id="sex">
	                      <option value="">请选择</option>
	                      <option value="男" 
	                      <s:if test='rb.sex=="男"'>selected</s:if>
	                      >男
	                      </option>
	                      <option value="女" 
	                      <s:if test='rb.sex=="女"'>selected</s:if>
	                      >女
	                      </option>
	                    </select>
                    </td>
                  </tr>
                  <tr>
                    <td height="30" align="right"><span style="color:red;">*</span>年龄：</td>
                    <td><input name="years" type="text" class="text2" id="years" value="<s:property value='rb.years'/>"></td>
                  </tr>
                  <tr>
                    <td height="30" align="right"><span style="color:red;">*</span>监护人姓名1：</td>
                    <td><input name="guardianname1" type="text" class="text2" id="guardianname1" value="<s:property value='rb.guardianname1'/>"></td>
                  </tr>
                  <tr>
                    <td height="30" align="right"><span style="color:red;">*</span>监护人联系电话1：</td>
                    <td><input name="guardianPhone1" type="text" class="text2" id="guardianPhone1" value="<s:property value='rb.guardianPhone1'/>"></td>
                  </tr>    
                  <tr>
                    <td height="30" align="right"><span style="color:red;">*</span>监护人姓名2：</td>
                    <td><input name="guardianname2" type="text" class="text2" id="guardianname2" value="<s:property value='rb.guardianname2'/>"></td>
                  </tr>
                  <tr>
                    <td height="30" align="right"><span style="color:red;">*</span>监护人联系电话2：</td>
                    <td><input name="guardianPhone2" type="text" class="text2" id="guardianPhone2" value="<s:property value='rb.guardianPhone2'/>"></td>
                  </tr>        
                  <tr>
                    <td height="30" align="right"><span style="color:red;">*</span>地址：</td>
                    <td><input name="address" type="text" class="text2" id="address" value="<s:property value='rb.address'/>"></td>
                  </tr>    
                  <tr>
                    <td height="30" align="right"><span style="color:red;">*</span>备注：</td>
                    <td><input name="description" type="text" class="text2" id="description" value="<s:property value='rb.description'/>"></td>
                  </tr>    
                  <tr>
                    <td height="30">&nbsp;</td>
                    <td><input type="submit" name="button" id="button" value="保存">
                      &nbsp;&nbsp;
                      <input type="button" name="button2" id="button2" value="返回上页" onClick="javascript:history.back(-1);"></td>
                  </tr>
                </table>
              </form></td>
            </tr>
          </table></td>
        </tr>
      </table></td>
    </tr>
    <tr>
      <td height="35" background="Images/bootBg.jpg">&nbsp;</td>
    </tr>
  </table>

</center>
</body>
</html>
