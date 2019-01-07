FreeMarker Template example: ${message}  

=======================
===  County List   ====
=======================


======Daring And Dashing===============
<#list countries as country>
	${country_index + 1}. ${country}
</#list>