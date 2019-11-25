# Getting Started

#Send Message
post:http://localhost:8080/rest/message
{
  "messageName" : "Message_Event",
  "businessKey" : "1",
  "processVariables" : {
    "user1" : {"value" : "created", "type": "String"
                    }}
}
