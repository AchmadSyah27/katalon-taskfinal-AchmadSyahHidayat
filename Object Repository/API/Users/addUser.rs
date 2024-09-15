<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>Menambahkan user baru</description>
   <name>addUser</name>
   <tag></tag>
   <elementGuidId>87708f16-822e-44c2-a332-30fbc16352b3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjZhY2RjNTRiLWJhYjctNGM0MS04YTBjLTM1NDRkM2QzNDBmMyIsImNvbXBhbnlJZCI6ImJmZDU0ZDRkLTI2ODgtNGVjYi05MWU1LThmZGQ3NDY5ZWRmMyIsImlhdCI6MTcyNjM0NTU5OX0.n7i4iUWtQfW5b4cYqucP7jTd3w2xtuVCt0v5NMyuQzI</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;name\&quot;: \&quot;${name}\&quot;,\n    \&quot;email\&quot;: \&quot;${email}\&quot;,\n    \&quot;password\&quot;: \&quot;${password}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>243a8923-89bd-4f02-a28e-78c4467b468c</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjZhY2RjNTRiLWJhYjctNGM0MS04YTBjLTM1NDRkM2QzNDBmMyIsImNvbXBhbnlJZCI6ImJmZDU0ZDRkLTI2ODgtNGVjYi05MWU1LThmZGQ3NDY5ZWRmMyIsImlhdCI6MTcyNjM0NTU5OX0.n7i4iUWtQfW5b4cYqucP7jTd3w2xtuVCt0v5NMyuQzI</value>
      <webElementGuid>ac5d4d5b-d2d9-4d0d-9b00-bc05f6d2501a</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.6.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${baseURL}/users?name=${name}&amp;email=${email}&amp;password=${password}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.baseURL</defaultValue>
      <description>Melakukan hit status app</description>
      <id>d58374f7-e2eb-4910-aac4-4806835a0e8e</id>
      <masked>false</masked>
      <name>baseURL</name>
   </variables>
   <variables>
      <defaultValue>findTestData('DataTest').getValue(1, 2)</defaultValue>
      <description>Mengambil data nama dari file excel</description>
      <id>39f80dcd-1955-4d84-af30-b032a905fd5e</id>
      <masked>false</masked>
      <name>name</name>
   </variables>
   <variables>
      <defaultValue>findTestData('DataTest').getValue(2, 2)</defaultValue>
      <description>Mengambil data email dari file excel</description>
      <id>7a5cc084-8b93-45d3-9aa9-452a17296213</id>
      <masked>false</masked>
      <name>email</name>
   </variables>
   <variables>
      <defaultValue>findTestData('DataTest').getValue(3, 2)</defaultValue>
      <description>Mengambil data password dari file excel</description>
      <id>0b939032-d6b1-461e-b066-8d281332b938</id>
      <masked>false</masked>
      <name>password</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

'Memastikan respon service 201'
WS.verifyResponseStatusCode(response, 201)

assertThat(response.getStatusCode()).isEqualTo(201)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
