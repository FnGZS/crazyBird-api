define({ "api": [
  {
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "optional": false,
            "field": "varname1",
            "description": "<p>No type.</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "varname2",
            "description": "<p>With type.</p>"
          }
        ]
      }
    },
    "type": "",
    "url": "",
    "version": "0.0.0",
    "filename": "./doc/main.js",
    "group": "D__crazyBird_api_ypxiaochengxu_api_src_api_doc_main_js",
    "groupTitle": "D__crazyBird_api_ypxiaochengxu_api_src_api_doc_main_js",
    "name": ""
  },
  {
    "type": "get",
    "url": "/affaris/affairsDetails/{id}",
    "title": "时事详情",
    "name": "affairsDetails",
    "group": "affaris",
    "version": "0.0.1",
    "description": "<p>时事详情</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "id",
            "description": "<p>时事id</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "id",
            "description": "<p>时事id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "title",
            "description": "<p>时事标题</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "affairsPic",
            "description": "<p>时事图片</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "content",
            "description": "<p>时事内容</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "typeId",
            "description": "<p>时事类型</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "brows",
            "description": "<p>浏览量</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "subordinate",
            "description": "<p>发布地</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "gmtCreated",
            "description": "<p>发布时间</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"id\": 10,\n\"title\": \"2018年我院省部级科研项目成绩喜人\",\n\"affairsPic\": \"http://www.ypc.edu.cn/yp/images/f1.png\", \n\"content\":\"2018年我院省部级科研项目立项成绩喜人，截止2018年10月，我院共立项省部级项目7项，创历年省部级课题立项新高。近年来，学院高度重视科研工作，不断总结现有经验，积极组织项目申报动员工作。通过发动教师培育项目，组织教师参加选题讲座和技能培训，组织相关专家开展论证会议，大大提高科研人员的申报积极性和项目成功率。\", \n\"typeId\": 2,\n\"brows\": 1, \n\"subordinate\": \"招就处\", \n\"gmtCreated\": \"2018-10-27 21:02:16.0\"",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":400,\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./AffairsApi.java",
    "groupTitle": "affaris"
  },
  {
    "type": "get",
    "url": "/affaris/getAffairsList",
    "title": "获得时事列表",
    "name": "getAffairsList",
    "group": "affaris",
    "version": "0.0.1",
    "description": "<p>获得时事列表</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "typeId",
            "description": "<p>时事类别id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "key",
            "description": "<p>搜索的关键字</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "pageNo",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "pageSize",
            "description": "<p>分页大小</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "pageNo",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "pageSize",
            "description": "<p>分页大小</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "pageCount",
            "description": "<p>总页数</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "recordCount",
            "description": "<p>总记录数</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "items",
            "description": "<p>列表</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "id",
            "description": "<p>时事id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "title",
            "description": "<p>时事标题</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "affairsPic",
            "description": "<p>时事图片</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "content",
            "description": "<p>时事内容</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "typeId",
            "description": "<p>时事类型</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "brows",
            "description": "<p>浏览量</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "subordinate",
            "description": "<p>发布地</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "gmtCreated",
            "description": "<p>发布时间</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"pageNo\": 1,\n\"pageSize\": 20,\n\"pageCount\": 1,\n\"recordCount\": 10,\n\"items\": [\n\t\t{\n       \"id\": 10,\n       \"title\": \"2018年我院省部级科研项目成绩喜人\",\n       \"affairsPic\": \"http://www.ypc.edu.cn/yp/images/f1.png\", \n       \"content\":\"2018年我院省部级科研项目立项成绩喜人，截止2018年10月，我院共立项省部级项目7项，创历年省部级课题立项新高。近年来，学院高度重视科研工作，不断总结现有经验，积极组织项目申报动员工作。通过发动教师培育项目，组织教师参加选题讲座和技能培训，组织相关专家开展论证会议，大大提高科研人员的申报积极性和项目成功率。\", \n       \"typeId\": 2,\n       \"brows\": 1, \n       \"subordinate\": \"招就处\", \n       \"gmtCreated\": \"2018-10-27 21:02:16.0\" \n   },\n   {\n       \"id\": 9,    \n       \"title\": \"2018年我院省部级科研项目成绩喜人\",         \n       \"affairsPic\": \"http://www.ypc.edu.cn/yp/images/f1.png\",         \n       \"content\":\"2018年我院省部级科研项目立项成绩喜人，截止2018年10月，我院共立项省部级项目7项，创历年省部级课题立项新高。近年来，学院高度重视科研工作，不断总结现有经验，积极组织项目申报动员工作。通过发动教师培育项目，组织教师参加选题讲座和技能培训，组织相关专家开展论证会议，大大提高科研人员的申报积极性和项目成功率。\",         \n       \"typeId\": 2,         \n       \"brows\": 1,         \n       \"subordinate\": \"招就处\",         \n       \"gmtCreated\": \"2018-10-27 20:50:37.0\"         \n   }",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":400,\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./AffairsApi.java",
    "groupTitle": "affaris"
  },
  {
    "type": "get",
    "url": "/affaris/type",
    "title": "获取时事类别信息",
    "name": "getAffairsType",
    "group": "affaris",
    "version": "0.0.1",
    "description": "<p>获取时事类别信息</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "tags",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "typeid",
            "description": "<p>类别id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "typeName",
            "description": "<p>类别名</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"tags\": [\n    {\n        \"typeid\": 1,\n        \"typeName\": \"学校要闻\"        \n    },       \n    {       \n        \"typeid\": 2, \n        \"typeName\": \"校区动态\"         \n    }                 \n ]",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":400,\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./AffairsApi.java",
    "groupTitle": "affaris"
  },
  {
    "type": "get",
    "url": "/calendar",
    "title": "校历",
    "name": "getCanlendarUrl",
    "group": "calendar",
    "version": "0.0.1",
    "description": "<p>校历</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "calendar",
            "description": "<p>校历图片地址</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"calendar\":\"\",\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./CalendarApi.java",
    "groupTitle": "calendar"
  },
  {
    "type": "get",
    "url": "/help/gethelp",
    "title": "帮助",
    "name": "getHelp",
    "group": "help",
    "version": "0.0.1",
    "description": "<p>帮助</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "items",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "items.title",
            "description": "<p>问题标题</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "items.content",
            "description": "<p>问题解决方案</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"items\":[\n{\n\t\t\"title\":\"登陆不了怎么回事\",\n\t\t\"content\":\"怎么办我怎么知道?，还不是因为你人丑\"\n\t}\n]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./HelpApi.java",
    "groupTitle": "help"
  },
  {
    "type": "get",
    "url": "/innovate/background",
    "title": "创业园模块首页背景图片",
    "name": "getInnovateBackground",
    "group": "innovate",
    "version": "0.0.1",
    "description": "<p>创业园模块首页背景图片</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "background",
            "description": "<p>创业园背景图片地址</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"background\":\"xxxxx.jpg\",\n}\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./InnovateApi.java",
    "groupTitle": "innovate"
  },
  {
    "type": "get",
    "url": "/innovate/list/{id}",
    "title": "得到企业详情",
    "name": "getInnovateEnterprise",
    "group": "innovate",
    "version": "0.0.1",
    "description": "<p>得到企业详情</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>企业id</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>企业id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "logo",
            "description": "<p>企业logo</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>企业名称</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "content",
            "description": "<p>企业展示内容</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"id\":1,\n\"logo\":\"xxxxx.jpg\",\n\"name\":\"疯鸟网络工作室\",\n\"content\":\"123123\"\n}\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./InnovateApi.java",
    "groupTitle": "innovate"
  },
  {
    "type": "get",
    "url": "/innovate/list",
    "title": "得到企业列表",
    "name": "getInnovateEnterpriseList",
    "group": "innovate",
    "version": "0.0.1",
    "description": "<p>得到企业列表</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "items",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "items.id",
            "description": "<p>企业id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "items.logo",
            "description": "<p>企业logo</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"items\":[\n{\n\t\t\"id\":1,\n\t\t\"logo\":\"xxxxx.jpg\"\n\t}\n]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./InnovateApi.java",
    "groupTitle": "innovate"
  },
  {
    "type": "get",
    "url": "/lost/getLostComment",
    "title": "获取评论",
    "name": "getLostComment",
    "group": "lost",
    "version": "0.0.1",
    "description": "<p>获取评论</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "articleId",
            "description": "<p>文章ID</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "items",
            "description": "<p>主评论列表</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "id",
            "description": "<p>评论id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "comment",
            "description": "<p>评论内容</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "articleId",
            "description": "<p>所属文章ID</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "item",
            "description": "<p>回复评论列表</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "commentId",
            "description": "<p>回复的评论ID</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "replyId",
            "description": "<p>回复的评论ID</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "replyedId",
            "description": "<p>被回复的评论的ID</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "gmtCreated",
            "description": "<p>回复评论的时间</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": null,\n\"pageNo\": 1,\n\"pageSize\": 20,\n\"pageCount\": 1,\n\"recordCount\": 3,\n\"items\": [\n {\n      \"id\": 13,\n      \"comment\": \"这个人我认识\",\n      \"articleId\": 2,\n      \"gmtCreated\": \"2018-12-08 16:56:19.0\",\n      \"item\": []\n  },\n  {\n      \"id\": 1,\n      \"comment\": \"666\",\n      \"articleId\": 2,\n    \t \"gmtCreated\": \"2018-12-08 16:56:19.0\",\n      \"item\": [\n          {\n              \"id\": 11,\n              \"commentId\": 1,\n              \"comment\": \"老哥稳！\",\n              \"articleId\": 0,\n              \"replyId\": 1,\n              \"replyedId\": 0,\n              \"gmtCreated\": \"2018-12-08 16:56:19.0\"\n          },\n      ]\n  }\n]",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":400,\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./LostApi.java",
    "groupTitle": "lost"
  },
  {
    "type": "get",
    "url": "/lost/lostDelete/{id}",
    "title": "删除发布的记录",
    "name": "getLostDelete",
    "group": "lost",
    "version": "0.0.1",
    "description": "<p>删除发布记录</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "id",
            "description": "<p>失物id</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n    \"code\": \"200\",\n    \"message\": \"删除成功\",\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":400,\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./LostApi.java",
    "groupTitle": "lost"
  },
  {
    "type": "get",
    "url": "/lost/lostDetails/{id}",
    "title": "失物详情",
    "name": "getLostDetails",
    "group": "lost",
    "version": "0.0.1",
    "description": "<p>失物详情</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "id",
            "description": "<p>失物id</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "details",
            "description": "<p>列表</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "id",
            "description": "<p>失物id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "title",
            "description": "<p>失物标题</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "publisher",
            "description": "<p>失物发布者id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "foundPic",
            "description": "<p>失物图片</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "content",
            "description": "<p>失物内容</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "contact",
            "description": "<p>联系方式</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "address",
            "description": "<p>地址</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "messageId",
            "description": "<p>物品分类</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "typeId",
            "description": "<p>失物分类id</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "isExamine",
            "description": "<p>失物审核状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "brow",
            "description": "<p>失物浏览量</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "isSolve",
            "description": "<p>失物解决状态</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "gmtCreated",
            "description": "<p>发布时间</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"items\": [\n\t\t{\n\"code\": \"200\",\n\"message\": null,\n\"pageNo\": 1,\n\"pageSize\": 20,\n\"pageCount\": 1,\n\"recordCount\": 2,\n\"items\": [\n\t\t{\n      \"id\": 1,\n      \"title\": \"谁看到我的花色雨伞\",\n      \"publisher\": 0401160111,\n      \"foundPic\": \"http://www.ypc.edu.cn/yp/images/f1.png\",\n      \"content\": \"本人丢了一把雨伞\",\n      \"contact\": \"电话：123456789\",\n      \"address\": \"绍兴文理学院元培学院\",\n      \"messageId\": 2,\n      \"typeId\": 1,\n      \"isExamine\": 1,\n      \"brow\": 0,\n      \"isSolve\": 1,\n      \"gmtCreated\": \"2018-12-04 19:51:34.0\"\n      \n  }",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":400,\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./LostApi.java",
    "groupTitle": "lost"
  },
  {
    "type": "get",
    "url": "/lost/getLostList",
    "title": "获取失物列表",
    "name": "getLostList",
    "group": "lost",
    "version": "0.0.1",
    "description": "<p>获取失物列表</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "typeId",
            "description": "<p>失物类别id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "key",
            "description": "<p>搜索的关键字</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "messageId",
            "description": "<p>失物物品类别id</p>"
          },
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "publisher",
            "description": "<p>当前账号id</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "pageNo",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "pageSize",
            "description": "<p>分页大小</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "pageNo",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "pageSize",
            "description": "<p>分页大小</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "pageCount",
            "description": "<p>总页数</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "recordCount",
            "description": "<p>总记录数</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "items",
            "description": "<p>列表</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "id",
            "description": "<p>失物id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "title",
            "description": "<p>失物标题</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "publisher",
            "description": "<p>失物发布者id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "foundPic",
            "description": "<p>失物图片</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "content",
            "description": "<p>失物内容</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "contact",
            "description": "<p>联系方式</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "address",
            "description": "<p>地址</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "messageId",
            "description": "<p>物品分类</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "typeId",
            "description": "<p>失物分类id</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "isExamine",
            "description": "<p>失物审核状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "brow",
            "description": "<p>失物浏览量</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "isSolve",
            "description": "<p>失物解决状态</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "gmtCreated",
            "description": "<p>发布时间</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": null,\n\"pageNo\": 1,\n\"pageSize\": 20,\n\"pageCount\": 1,\n\"recordCount\": 2,\n\"items\": [\n\t\t{\n      \"id\": 1,\n      \"title\": \"谁看到我的花色雨伞\",\n      \"publisher\": 0401160111,\n      \"foundPic\": \"http://www.ypc.edu.cn/yp/images/f1.png\",\n      \"content\": \"本人丢了一把雨伞\",\n      \"contact\": \"电话：123456789\",\n      \"address\": \"绍兴文理学院元培学院\",\n      \"messageId\": 2,\n      \"typeId\": 1,\n      \"isExamine\": 1,\n      \"brow\": 0,\n      \"isSolve\": 1,\n      \"gmtCreated\": \"2018-12-04 19:51:34.0\"\n      \n  },\n  {\n      \"id\": 2,\n      \"title\": \"U盘不见了，急急急\",\n      \"publisher\": 0401160111,\n      \"foundPic\": \"http://www.ypc.edu.cn/yp/images/f1.png\",\n      \"content\": \"本人丢了一U盘\",\n      \"contact\": \"电话：123456789\",\n      \"address\": \"绍兴文理学院元培学院\",\n      \"messageId\": 2,\n      \"typeId\": 3,\n      \"isExamine\": 2,\n      \"brow\": 1,\n      \"isSolve\": 1,\n      \"gmtCreated\": \"2018-12-04 19:51:34.0\"\n      \n  }",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":400,\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./LostApi.java",
    "groupTitle": "lost"
  },
  {
    "type": "get",
    "url": "/lost/lostMessage",
    "title": "获取失物分类信息",
    "name": "getLostMessage",
    "group": "lost",
    "version": "0.0.1",
    "description": "<p>获取失物分类信息</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "lostTypeList",
            "description": "<p>列表</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "typeId",
            "description": "<p>分类id</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"lostTypeList\": [\n    {\n        \"typeId\": 1,\n        \"message\": \"失物\"        \n    },       \n    {       \n        \"typeId\": 2, \n        \"message\": \"招领\"         \n    }                 \n ]",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":400,\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./LostApi.java",
    "groupTitle": "lost"
  },
  {
    "type": "get",
    "url": "/lost/lostType",
    "title": "获取物品分类信息",
    "name": "getLostType",
    "group": "lost",
    "version": "0.0.1",
    "description": "<p>获取物品分类信息</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "lostTypeList",
            "description": "<p>列表</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "typeId",
            "description": "<p>分类id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "typeName",
            "description": "<p>物品名</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"lostTypeList\": [\n    {\n        \"typeId\": 1,\n        \"typeName\": \"饭卡\"        \n    },       \n    {       \n        \"typeId\": 2, \n        \"typeName\": \"身份证\"         \n    }                 \n ]",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":400,\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./LostApi.java",
    "groupTitle": "lost"
  },
  {
    "type": "post",
    "url": "/lost//lostCommentIn",
    "title": "用户评论",
    "name": "setLostCommentIn",
    "group": "lost",
    "version": "0.0.1",
    "description": "<p>用户评论</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "commentId",
            "description": "<p>从属评论ID</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "comment",
            "description": "<p>评论内容</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "articleId",
            "description": "<p>所属文章ID</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "replyId",
            "description": "<p>回复ID</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "replyedId",
            "description": "<p>被回复ID</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n     \"code\": \"200\",\n     \"message\": \"回复成功\",\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":400,\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./LostApi.java",
    "groupTitle": "lost"
  },
  {
    "type": "post",
    "url": "/lost/lostInput",
    "title": "录入失物信息",
    "name": "setLostInput",
    "group": "lost",
    "version": "0.0.1",
    "description": "<p>录入失物信息</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "title",
            "description": "<p>失物标题</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "foundPic",
            "description": "<p>失物图片</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "content",
            "description": "<p>详情</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "contact",
            "description": "<p>联系方式</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "address",
            "description": "<p>地址</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "typeId",
            "description": "<p>失物分类id</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "messageId",
            "description": "<p>失物物品类别id</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n     \"code\": \"200\",\n     \"message\": \"录入成功\",\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":400,\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./LostApi.java",
    "groupTitle": "lost"
  },
  {
    "type": "post",
    "url": "/opinion/creat",
    "title": "添加意见信息",
    "name": "creat",
    "group": "opinion",
    "version": "0.0.1",
    "description": "<p>添加意见信息</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "proposal",
            "description": "<p>建议</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phone",
            "description": "<p>电话</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "wxid",
            "description": "<p>微信号</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "Long",
            "optional": false,
            "field": "result",
            "description": "<p>结果</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"result\": 1",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":400,\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./OpinionApi.java",
    "groupTitle": "opinion"
  },
  {
    "type": "get",
    "url": "/secondary/create",
    "title": "发布二手商品",
    "name": "createSecondaryGoods",
    "group": "secondary",
    "version": "0.0.1",
    "description": "<p>发布二手商品</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "userId",
            "description": ""
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "goodsType",
            "description": "<p>商品类型</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "goodsWay",
            "description": "<p>售卖形式</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "tradingWay",
            "description": "<p>交易方式</p>"
          },
          {
            "group": "Parameter",
            "type": "BigDecimal",
            "optional": false,
            "field": "price",
            "description": "<p>价格</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "goodsTitle",
            "description": "<p>商品标题</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "goodsContent",
            "description": "<p>商品内容</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "goodsImag",
            "description": "<p>商品图片</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "postion",
            "description": "<p>位置</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"发布成功\"\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./SecondaryApi.java",
    "groupTitle": "secondary"
  },
  {
    "type": "get",
    "url": "/secondary/goods/{id}",
    "title": "得到某个商品详情",
    "name": "getSecondaryGoods",
    "group": "secondary",
    "version": "0.0.1",
    "description": "<p>得到某个商品详情</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "id",
            "description": ""
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageNo",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>页面大小</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageCount",
            "description": "<p>总页数</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "recordCount",
            "description": "<p>总记录数</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "list",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "list.id",
            "description": "<p>ID</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "list.userId",
            "description": "<p>用户ID</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "list.views",
            "description": "<p>浏览量</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "list.goodsNum",
            "description": "<p>商品数量</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.userName",
            "description": "<p>用户名</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.headImgUrl",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsTitle",
            "description": "<p>商品标题</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsContent",
            "description": "<p>商品内容</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsImag",
            "description": "<p>商品图片</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.postion",
            "description": "<p>位置</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsType",
            "description": "<p>商品类型</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsWay",
            "description": "<p>售卖形式</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.tradingWay",
            "description": "<p>交易方式</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.price",
            "description": "<p>价格</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.gmtCreated",
            "description": "<p>发布</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"list\": [\n  {\n      \"id\": 1,\n      \"userId\": 4131502368,\n      \"views\": 209,\n      \"goodsNum\": 0,\n      \"userName\": \"\",\n      \"headImgUrl\": \"\",\n      \"goodsTitle\": \"多了个iphone8，七成新\",\n      \"goodsContent\": \"这个iphone8当初八千入手，现在低价卖出，可提供三包证明，七成新。\",\n      \"goodsImag\": \"xxxxx.jpg\",\n      \"postion\": \"绍兴文理学院元培学校北区11幢\",\n      \"goodsType\": \"手机电脑\",\n      \"goodsWay\": \"寄卖\",\n      \"tradingWay\": \"自提\",\n      \"price\": \"6000.00\",\n      \"gmtCreated\": \"2018-12-14 17:18:52\"\n  }\n]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./SecondaryApi.java",
    "groupTitle": "secondary"
  },
  {
    "type": "get",
    "url": "/secondary/user",
    "title": "我发布的商品",
    "name": "getSecondaryGoodsByUser",
    "group": "secondary",
    "version": "0.0.1",
    "description": "<p>我发布的商品</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "id",
            "description": ""
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageNo",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>页面大小</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageNo",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>页面大小</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageCount",
            "description": "<p>总页数</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "recordCount",
            "description": "<p>总记录数</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "list",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "list.id",
            "description": "<p>ID</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "list.userId",
            "description": "<p>用户ID</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "list.views",
            "description": "<p>浏览量</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "list.goodsNum",
            "description": "<p>商品数量</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.userName",
            "description": "<p>用户名</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.headImgUrl",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsTitle",
            "description": "<p>商品标题</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsContent",
            "description": "<p>商品内容</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsImag",
            "description": "<p>商品图片</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.postion",
            "description": "<p>位置</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsType",
            "description": "<p>商品类型</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsWay",
            "description": "<p>售卖形式</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.tradingWay",
            "description": "<p>交易方式</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.price",
            "description": "<p>价格</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.gmtCreated",
            "description": "<p>发布</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"pageNo\": 1,\n\"pageSize\": 20,\n\"pageCount\": 1,\n\"recordCount\": 5,\n\"list\": [\n  {\n      \"id\": 6,\n      \"userId\": 413150238,\n      \"views\": 0,\n      \"goodsNum\": 0,\n      \"userName\": \"我是智障\",\n      \"headImgUrl\": \"https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132\",\n      \"goodsTitle\": \"dsadasd\",\n      \"goodsContent\": \"qweqwdasd\",\n      \"goodsImag\": \"asdasds.jpg\",\n      \"postion\": \"waeasd\",\n      \"goodsType\": \"手机电脑\",\n      \"goodsWay\": \"寄卖\",\n      \"tradingWay\": \"自提\",\n      \"price\": \"222.22\",\n      \"gmtCreated\": \"2018-12-17 23:01:21\"\n  },\n  {\n      \"id\": 5,\n      \"userId\": 413150238,\n      \"views\": 0,\n      \"goodsNum\": 0,\n      \"userName\": \"我是智障\",\n      \"headImgUrl\": \"https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132\",\n      \"goodsTitle\": \"dsadasd\",\n      \"goodsContent\": \"qweqwdasd\",\n      \"goodsImag\": \"asdasds.jpg\",\n      \"postion\": \"waeasd\",\n      \"goodsType\": \"手机电脑\",\n      \"goodsWay\": \"寄卖\",\n      \"tradingWay\": \"自提\",\n      \"price\": \"222.22\",\n      \"gmtCreated\": \"2018-12-17 22:59:54\"\n  },\n  {\n      \"id\": 4,\n      \"userId\": 413150238,\n      \"views\": 0,\n      \"goodsNum\": 0,\n      \"userName\": \"我是智障\",\n      \"headImgUrl\": \"https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132\",\n      \"goodsTitle\": \"多了个iphone7，六成新\",\n      \"goodsContent\": \"这个iphone8当初八千入手，现在低价卖出，可提供三包证明，七成新。\",\n      \"goodsImag\": \"1sadasd.jpg\",\n      \"postion\": \"绍兴文理学院元培学校北区11幢\",\n      \"goodsType\": \"日常生活\",\n      \"goodsWay\": \"个人\",\n      \"tradingWay\": \"自提\",\n      \"price\": \"5000.11\",\n      \"gmtCreated\": \"2018-12-17 22:56:07\"\n  },\n  {\n      \"id\": 3,\n      \"userId\": 413150238,\n      \"views\": 220,\n      \"goodsNum\": 0,\n      \"userName\": \"我是智障\",\n      \"headImgUrl\": \"https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132\",\n      \"goodsTitle\": \"多了个iphone7，六成新\",\n      \"goodsContent\": \"这个iphone8当初八千入手，现在低价卖出，可提供三包证明，七成新。\",\n      \"goodsImag\": \"1sadasd.jpg\",\n      \"postion\": \"绍兴文理学院元培学校北区11幢\",\n      \"goodsType\": \"游戏交易\",\n      \"goodsWay\": \"个人\",\n      \"tradingWay\": \"自送\",\n      \"price\": \"5000.11\",\n      \"gmtCreated\": \"2018-12-17 22:02:51\"\n  },\n  {\n      \"id\": 2,\n      \"userId\": 413150238,\n      \"views\": 222,\n      \"goodsNum\": 0,\n      \"userName\": \"我是智障\",\n      \"headImgUrl\": \"https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132\",\n      \"goodsTitle\": \"多了个iphone7，六成新\",\n      \"goodsContent\": \"这个iphone8当初八千入手，现在低价卖出，可提供三包证明，七成新。\",\n      \"goodsImag\": \"xxx.jpg\",\n      \"postion\": \"绍兴文理学院元培学校北区11幢\",\n      \"goodsType\": \"游戏交易\",\n      \"goodsWay\": \"个人\",\n      \"tradingWay\": \"自送\",\n      \"price\": \"6000.00\",\n      \"gmtCreated\": \"2018-12-15 13:28:03\"\n  }\n]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./SecondaryApi.java",
    "groupTitle": "secondary"
  },
  {
    "type": "get",
    "url": "/secondary/search",
    "title": "得到某分类的商品列表",
    "name": "getSecondaryGoodsList",
    "group": "secondary",
    "version": "0.0.1",
    "description": "<p>得到某分类的商品列表</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "goodsType",
            "description": "<p>商品类型</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageNo",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>页面大小</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageNo",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>页面大小</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageCount",
            "description": "<p>总页数</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "recordCount",
            "description": "<p>总记录数</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "list",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "list.id",
            "description": "<p>ID</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "list.userId",
            "description": "<p>用户ID</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "list.views",
            "description": "<p>浏览量</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "list.goodsNum",
            "description": "<p>商品数量</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.userName",
            "description": "<p>用户名</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.headImgUrl",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsTitle",
            "description": "<p>商品标题</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsContent",
            "description": "<p>商品内容</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsImag",
            "description": "<p>商品图片</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.postion",
            "description": "<p>位置</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsType",
            "description": "<p>商品类型</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsWay",
            "description": "<p>售卖形式</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.tradingWay",
            "description": "<p>交易方式</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.price",
            "description": "<p>价格</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.gmtCreated",
            "description": "<p>发布</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"pageNo\": 1,\n\"pageSize\": 20,\n\"pageCount\": 1,\n\"recordCount\": 6,\n\"list\": [\n  {\n      \"id\": 6,\n      \"userId\": 413150238,\n      \"views\": 0,\n      \"goodsNum\": 0,\n      \"userName\": \"我是智障\",\n      \"headImgUrl\": \"https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132\",\n      \"goodsTitle\": \"dsadasd\",\n      \"goodsContent\": \"qweqwdasd\",\n      \"goodsImag\": \"asdasds.jpg\",\n      \"postion\": \"waeasd\",\n      \"goodsType\": \"手机电脑\",\n      \"goodsWay\": \"寄卖\",\n      \"tradingWay\": \"自提\",\n      \"price\": \"222.22\",\n      \"gmtCreated\": \"2018-12-17 23:01:21\"\n  },\n  {\n      \"id\": 5,\n      \"userId\": 413150238,\n      \"views\": 0,\n      \"goodsNum\": 0,\n      \"userName\": \"我是智障\",\n      \"headImgUrl\": \"https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132\",\n      \"goodsTitle\": \"dsadasd\",\n      \"goodsContent\": \"qweqwdasd\",\n      \"goodsImag\": \"asdasds.jpg\",\n      \"postion\": \"waeasd\",\n      \"goodsType\": \"手机电脑\",\n      \"goodsWay\": \"寄卖\",\n      \"tradingWay\": \"自提\",\n      \"price\": \"222.22\",\n      \"gmtCreated\": \"2018-12-17 22:59:54\"\n  },\n  {\n      \"id\": 4,\n      \"userId\": 413150238,\n      \"views\": 0,\n      \"goodsNum\": 0,\n      \"userName\": \"我是智障\",\n      \"headImgUrl\": \"https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132\",\n      \"goodsTitle\": \"多了个iphone7，六成新\",\n      \"goodsContent\": \"这个iphone8当初八千入手，现在低价卖出，可提供三包证明，七成新。\",\n      \"goodsImag\": \"1sadasd.jpg\",\n      \"postion\": \"绍兴文理学院元培学校北区11幢\",\n      \"goodsType\": \"日常生活\",\n      \"goodsWay\": \"个人\",\n      \"tradingWay\": \"自提\",\n      \"price\": \"5000.11\",\n      \"gmtCreated\": \"2018-12-17 22:56:07\"\n  },\n  {\n      \"id\": 3,\n      \"userId\": 413150238,\n      \"views\": 220,\n      \"goodsNum\": 0,\n      \"userName\": \"我是智障\",\n      \"headImgUrl\": \"https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132\",\n      \"goodsTitle\": \"多了个iphone7，六成新\",\n      \"goodsContent\": \"这个iphone8当初八千入手，现在低价卖出，可提供三包证明，七成新。\",\n      \"goodsImag\": \"1sadasd.jpg\",\n      \"postion\": \"绍兴文理学院元培学校北区11幢\",\n      \"goodsType\": \"游戏交易\",\n      \"goodsWay\": \"个人\",\n      \"tradingWay\": \"自送\",\n      \"price\": \"5000.11\",\n      \"gmtCreated\": \"2018-12-17 22:02:51\"\n  },\n  {\n      \"id\": 2,\n      \"userId\": 413150238,\n      \"views\": 222,\n      \"goodsNum\": 0,\n      \"userName\": \"我是智障\",\n      \"headImgUrl\": \"https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132\",\n      \"goodsTitle\": \"多了个iphone7，六成新\",\n      \"goodsContent\": \"这个iphone8当初八千入手，现在低价卖出，可提供三包证明，七成新。\",\n      \"goodsImag\": \"xxx.jpg\",\n      \"postion\": \"绍兴文理学院元培学校北区11幢\",\n      \"goodsType\": \"游戏交易\",\n      \"goodsWay\": \"个人\",\n      \"tradingWay\": \"自送\",\n      \"price\": \"6000.00\",\n      \"gmtCreated\": \"2018-12-15 13:28:03\"\n  },\n  {\n      \"id\": 1,\n      \"userId\": 4131502368,\n      \"views\": 208,\n      \"goodsNum\": 0,\n      \"userName\": \"\",\n      \"headImgUrl\": \"\",\n      \"goodsTitle\": \"多了个iphone8，七成新\",\n      \"goodsContent\": \"这个iphone8当初八千入手，现在低价卖出，可提供三包证明，七成新。\",\n      \"goodsImag\": \"xxxxx.jpg\",\n      \"postion\": \"绍兴文理学院元培学校北区11幢\",\n      \"goodsType\": \"手机电脑\",\n      \"goodsWay\": \"寄卖\",\n      \"tradingWay\": \"自提\",\n      \"price\": \"6000.00\",\n      \"gmtCreated\": \"2018-12-14 17:18:52\"\n  }\n]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./SecondaryApi.java",
    "groupTitle": "secondary"
  },
  {
    "type": "get",
    "url": "/secondary/slide",
    "title": "得到二手市场首页轮播图",
    "name": "getSecondarySlide",
    "group": "secondary",
    "version": "0.0.1",
    "description": "<p>得到二手市场首页轮播图</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "list",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "list.id",
            "description": "<p>ID</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.slideImg",
            "description": "<p>轮播图</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"list\": [\n  {\n      \"id\": 1,\n      \"slideImg\": \"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1545113327578&di=ea0897c59dc413dd7690aaab6e956a1d&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F017cd755fad1666ac7251df86d1034.jpg%401280w_1l_2o_100sh.jpg\"\n  }\n]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./SecondaryApi.java",
    "groupTitle": "secondary"
  },
  {
    "type": "get",
    "url": "/secondary/traydingWay",
    "title": "得到交易方式",
    "name": "getSecondaryTradingWay",
    "group": "secondary",
    "version": "0.0.1",
    "description": "<p>得到交易方式</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "list",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "list.id",
            "description": "<p>ID</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.field",
            "description": "<p>名字</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"list\": [\n  {\n      \"id\": 1,\n      \"field\": \"自提\"\n  },\n  {\n      \"id\": 2,\n      \"field\": \"自送\"\n  },\n  {\n      \"id\": 3,\n      \"field\": \"跑腿\"\n  }\n]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./SecondaryApi.java",
    "groupTitle": "secondary"
  },
  {
    "type": "get",
    "url": "/secondary/type",
    "title": "得到商品分类",
    "name": "getSecondaryType",
    "group": "secondary",
    "version": "0.0.1",
    "description": "<p>得到商品分类</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "list",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "list.id",
            "description": "<p>ID</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.field",
            "description": "<p>名字</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"list\": [\n  {\n      \"id\": 0,\n      \"field\": \"所有\"\n  },\n  {\n      \"id\": 1,\n      \"field\": \"手机电脑\"\n  },\n  {\n      \"id\": 2,\n      \"field\": \"游戏交易\"\n  },\n  {\n      \"id\": 3,\n      \"field\": \"二手车\"\n  },\n  {\n      \"id\": 4,\n      \"field\": \"日常生活\"\n  },\n  {\n      \"id\": 5,\n      \"field\": \"美妆产品\"\n  },\n  {\n      \"id\": 6,\n      \"field\": \"家居家电\"\n  },\n  {\n      \"id\": 7,\n      \"field\": \"体育用品\"\n  },\n  {\n      \"id\": 8,\n      \"field\": \"课本读物\"\n  },\n  {\n      \"id\": 9,\n      \"field\": \"数码产品\"\n  }\n]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./SecondaryApi.java",
    "groupTitle": "secondary"
  },
  {
    "type": "get",
    "url": "/secondary/way",
    "title": "得到售卖形式",
    "name": "getSecondaryWay",
    "group": "secondary",
    "version": "0.0.1",
    "description": "<p>得到售卖形式</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "list",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "list.id",
            "description": "<p>ID</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.field",
            "description": "<p>名字</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"list\": [\n  {\n      \"id\": 1,\n      \"field\": \"寄卖\"\n  },\n  {\n      \"id\": 2,\n      \"field\": \"个人\"\n  }\n]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./SecondaryApi.java",
    "groupTitle": "secondary"
  },
  {
    "type": "get",
    "url": "/secondary/search",
    "title": "搜索",
    "name": "searchSecondaryGoods",
    "group": "secondary",
    "version": "0.0.1",
    "description": "<p>搜索</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "keyWord",
            "description": "<p>关键字</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageNo",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>页面大小</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageNo",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>页面大小</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageCount",
            "description": "<p>总页数</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "recordCount",
            "description": "<p>总记录数</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "list",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "list.id",
            "description": "<p>ID</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "list.userId",
            "description": "<p>用户ID</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "list.views",
            "description": "<p>浏览量</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "list.goodsNum",
            "description": "<p>商品数量</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.userName",
            "description": "<p>用户名</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.headImgUrl",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsTitle",
            "description": "<p>商品标题</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsContent",
            "description": "<p>商品内容</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsImag",
            "description": "<p>商品图片</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.postion",
            "description": "<p>位置</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsType",
            "description": "<p>商品类型</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.goodsWay",
            "description": "<p>售卖形式</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.tradingWay",
            "description": "<p>交易方式</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.price",
            "description": "<p>价格</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "list.gmtCreated",
            "description": "<p>发布</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"pageNo\": 1,\n\"pageSize\": 20,\n\"pageCount\": 1,\n\"recordCount\": 2,\n\"list\": [\n  {\n      \"id\": 6,\n      \"userId\": 413150238,\n      \"views\": 0,\n      \"goodsNum\": 0,\n      \"userName\": \"我是智障\",\n      \"headImgUrl\": \"https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132\",\n      \"goodsTitle\": \"dsadasd\",\n      \"goodsContent\": \"qweqwdasd\",\n      \"goodsImag\": \"asdasds.jpg\",\n      \"postion\": \"waeasd\",\n      \"goodsType\": \"手机电脑\",\n      \"goodsWay\": \"寄卖\",\n      \"tradingWay\": \"自提\",\n      \"price\": \"222.22\",\n      \"gmtCreated\": \"2018-12-17 23:01:21\"\n  },\n  {\n      \"id\": 5,\n      \"userId\": 413150238,\n      \"views\": 0,\n      \"goodsNum\": 0,\n      \"userName\": \"我是智障\",\n      \"headImgUrl\": \"https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132\",\n      \"goodsTitle\": \"dsadasd\",\n      \"goodsContent\": \"qweqwdasd\",\n      \"goodsImag\": \"asdasds.jpg\",\n      \"postion\": \"waeasd\",\n      \"goodsType\": \"手机电脑\",\n      \"goodsWay\": \"寄卖\",\n      \"tradingWay\": \"自提\",\n      \"price\": \"222.22\",\n      \"gmtCreated\": \"2018-12-17 22:59:54\"\n  }\n]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./SecondaryApi.java",
    "groupTitle": "secondary"
  },
  {
    "type": "post",
    "url": "/upload/avatar",
    "title": "上传单张图片通用接口（非OSS）",
    "name": "doUploadAvr",
    "group": "upload",
    "version": "0.0.1",
    "description": "<p>上传单张图片通用接口（非OSS）</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "File",
            "optional": false,
            "field": "file",
            "description": "<p>图片文件</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "picType",
            "description": "<p>业务类型（vote,affairs,userLogin......）</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "urlList",
            "description": "<p>图片路径</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"urlList\": [\n     \"www.sxscott.com/crazyBirdimg/testtest/testtest_20181122185111004.jpg\"\n   \n]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./UploadApi.java",
    "groupTitle": "upload"
  },
  {
    "type": "post",
    "url": "/upload/pic",
    "title": "上传图片通用接口（支持批量,非OSS）",
    "name": "doUploadPic",
    "group": "upload",
    "version": "0.0.1",
    "description": "<p>上传图片通用接口（支持批量,非OSS）</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "File",
            "optional": false,
            "field": "files",
            "description": "<p>图片文件</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "picType",
            "description": "<p>业务类型（vote,affairs,userLogin......）</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "urlList",
            "description": "<p>图片路径</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"urlList\": [\n     \"www.sxscott.com/crazyBirdimg/testtest/testtest_20181122185111004.jpg\"\n   \n]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./UploadApi.java",
    "groupTitle": "upload"
  },
  {
    "type": "post",
    "url": "/user/sms",
    "title": "短信验证码",
    "name": "smsget",
    "group": "user",
    "version": "0.0.1",
    "description": "<p>短信验证码</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phone",
            "description": "<p>手机</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\"\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":400,\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./UserLoignApi.java",
    "groupTitle": "user"
  },
  {
    "type": "post",
    "url": "/user/binding",
    "title": "绑定学号",
    "name": "userBinding",
    "group": "user",
    "version": "0.0.1",
    "description": "<p>绑定学号</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "schoolNum",
            "description": "<p>学号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phone",
            "description": "<p>电话号码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>验证码</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "result",
            "description": "<p>登录后是否绑定的状态</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "asToken",
            "description": "<p>绑定后的登录态</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"绑定成功\",\n\"asToken\": \"GCUX8pVPpHwDCR7cKKvhKiQbVh0cXxQq8XTCJUv/BEFgFiDqut0rfZrXLz3hbwys\",\n\"result\":\"1\"\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":400,\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./UserLoignApi.java",
    "groupTitle": "user"
  },
  {
    "type": "post",
    "url": "/user/login",
    "title": "获得微信小程序第三方登录",
    "name": "userLogin",
    "group": "user",
    "version": "0.0.1",
    "description": "<p>获得微信小程序第三方登录</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "platCode",
            "description": "<p>小程序微信公共登录时返回的code</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "platUserInfoMap",
            "description": "<p>信息数据包</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "userName",
            "description": "<p>用户名</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "authorization",
            "description": "<p>登录态</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "sex",
            "description": "<p>性别</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "openAccount",
            "description": "<p>用户名</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "isbound",
            "description": "<p>是否绑定</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"userName\": \"Effort\",\n\"authorization\": \"ojime4rpVaRSueHI6yr5Y-zRYbf4\",\n\"sex\": \"1\",\n\"openAccount\": \"Effort\",\n\"isbound\":\"2\"",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":400,\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./UserLoignApi.java",
    "groupTitle": "user"
  },
  {
    "type": "post",
    "url": "/vote/check",
    "title": "检测投票",
    "name": "checkVoteRecord",
    "group": "vote",
    "version": "0.0.1",
    "description": "<p>检测投票</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "long",
            "optional": false,
            "field": "studentId",
            "description": "<p>学生id</p>"
          },
          {
            "group": "Parameter",
            "type": "long",
            "optional": false,
            "field": "actionId",
            "description": "<p>活动id</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "status",
            "description": "<p>状态码(0:未投票，1:已投票)</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "detail",
            "description": "<p>投票明细</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\t\t\"code\":\"200\",\n\t    \"message\": \"你已经投过票\",\n\t\t\"status\": 1,\n\t\t\"detail\": \"1,2\"\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./VoteApi.java",
    "groupTitle": "vote"
  },
  {
    "type": "post",
    "url": "/vote/create",
    "title": "投票",
    "name": "createVoteDetailNum__",
    "group": "vote",
    "version": "0.0.1",
    "description": "<p>投票</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "long",
            "optional": false,
            "field": "actionId",
            "description": "<p>活动id</p>"
          },
          {
            "group": "Parameter",
            "type": "long",
            "optional": false,
            "field": "studentId",
            "description": "<p>投票人id</p>"
          },
          {
            "group": "Parameter",
            "type": "long",
            "optional": false,
            "field": "sum",
            "description": "<p>投的票数</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "detail",
            "description": "<p>投票明细(2,4,5)</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\n    \"code\": \"200\",\n\t   \"message\": \"投票成功\"\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"你已经投过票\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./VoteApi.java",
    "groupTitle": "vote"
  },
  {
    "type": "get",
    "url": "/vote/getAction/detail/{id}",
    "title": "获得投票详情",
    "name": "getActionDetail",
    "group": "vote",
    "version": "0.0.1",
    "description": "<p>获得活动详情</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "id",
            "description": "<p>活动id</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "id",
            "description": "<p>活动ID</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "actionName",
            "description": "<p>活动名</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "actionImage",
            "description": "<p>图片路径</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "actionInfo",
            "description": "<p>活动简介</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteRuler",
            "description": "<p>活动规则</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "host",
            "description": "<p>活动举办方</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "telephone",
            "description": "<p>联系号码</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "status",
            "description": "<p>活动状态(0:已结束,1:正进行,2:未开始)</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "visistNum",
            "description": "<p>访问次数</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteSum",
            "description": "<p>投票总数</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteMax",
            "description": "<p>最多投票</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "votemin",
            "description": "<p>最少投票</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "startTIme",
            "description": "<p>开始时间</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "timeDiff",
            "description": "<p>时间差（毫秒）</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "endTime",
            "description": "<p>截止时间</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "voteDetailList",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "voteDetailList.id",
            "description": "<p>候选人id</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "voteDetailList.actionId",
            "description": "<p>所属活动id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.peopleName",
            "description": "<p>候选人名字</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.imageUrl",
            "description": "<p>候选人图片路径</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.className",
            "description": "<p>所属分类</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "voteDetailList.serialId",
            "description": "<p>编号</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "voteDetailList.num",
            "description": "<p>票数</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"id\": 0,\n\"actionName\": \"1\",\n\"actionIntro\": \"1\",\n\"voteRuler\": \"1\",\n\"actionImage\": \"/test/test/test.jpg\",\n\"host\": \"1\",\n\"telephone\": \"1\",\n\"status\": 1,\n\"voteMax\":7,\n\"voteMin\":1,\n\"visitNum\": 17,\n\"voteSum\": 2,\n\"startTime\": \"2018-09-25 00:00:00\",\n\"endTime\": \"2018-09-25 00:00:00\",\n\"voteDetailList\": [\n   {\n       \"id\": 1,\n       \"actionId\": 1,\n       \"peopleName\": \"嘿嘿嘿嘿\",\n       \"imageUrl\": \"/test/test.jpg\",\n       \"className\": \"嘿嘿嘿嘿\",\n       \"compete\": \"嘿嘿嘿嘿\",\n       \"serialId\":1,\n       \"num\": 22\n   }\n]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./VoteApi.java",
    "groupTitle": "vote"
  },
  {
    "type": "get",
    "url": "/vote/getAction/detail/rank/{id}",
    "title": "获得投票排名详情",
    "name": "getActionDetailByRank",
    "group": "vote",
    "version": "0.0.1",
    "description": "<p>获得投票排名详情</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "id",
            "description": "<p>活动id</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "voteDetailList",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "voteDetailList.id",
            "description": "<p>候选人id</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "voteDetailList.actionId",
            "description": "<p>所属活动id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.peopleName",
            "description": "<p>候选人名字</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.imageUrl",
            "description": "<p>候选人图片路径</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.className",
            "description": "<p>所属分类</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "voteDetailList.serialId",
            "description": "<p>编号</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "voteDetailList.num",
            "description": "<p>票数</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"voteDetailList\": [\n   {\n       \"id\": 1,\n       \"actionId\": 1,\n       \"peopleName\": \"嘿嘿嘿嘿\",\n       \"imageUrl\": \"/test/test.jpg\",\n       \"className\": \"嘿嘿嘿嘿\",\n       \"serialId\" 1,\n       \"num\": 22\n   }\n]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./VoteApi.java",
    "groupTitle": "vote"
  },
  {
    "type": "post",
    "url": "/vote/getAction",
    "title": "获得投票活动列表",
    "name": "getActionList",
    "group": "vote",
    "version": "0.0.1",
    "description": "<p>获得投票活动列表</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "status",
            "description": "<p>状态码(0:已结束,1:正进行,2:未开始)</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageNo",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>页面大小</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageNo",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>页面大小</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageCount",
            "description": "<p>总页数</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "recordCount",
            "description": "<p>总记录数</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "voteList",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "voteList.id",
            "description": "<p>活动ID</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.actionName",
            "description": "<p>活动名</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.actionImage",
            "description": "<p>活动图片路径</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.actionInfo",
            "description": "<p>活动简介</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.voteRuler",
            "description": "<p>活动规则</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.host",
            "description": "<p>活动举办方</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.telephone",
            "description": "<p>联系号码</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteList.status",
            "description": "<p>活动状态(0:已结束,1:正进行,2:未开始)</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteList.visistNum",
            "description": "<p>访问次数</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteList.voteMax",
            "description": "<p>最多投票</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteList.voteMin",
            "description": "<p>最少投票</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteList.voteSum",
            "description": "<p>投票总数</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.startTime",
            "description": "<p>开始时间</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.endTime",
            "description": "<p>截止时间</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"pageNo\": 1,\n\"pageSize\": 10,\n\"pageCount\": 1,\n\"recordCount\": 2,\n\"voteList\": [\n   {\n       \"id\": 2,\n       \"actionName\": \"2\",\n       \"actionImage\": \"/test/test/ewrwer.jpg\",\n       \"actionIntro\": \"2\",\n       \"voteRuler\": \"2\",\n       \"host\": \"2\",\n       \"telephone\": \"2\",\n       \"status\": 1,\n       \"voteMax\":7,\n       \"voteMin\":1,\n       \"visitNum\": 2,\n       \"voteSum\": 2,\n       \"startTime\": \"2018-09-27 00:00:00\",\n       \"endTimed\": \"2018-09-27 00:00:00\"\n   },\n   {\n       \"id\": 1,\n       \"actionName\": \"1\",\n       \"actionImage\": \"/test/test/test.jpg\",\n       \"actionIntro\": \"1\",\n       \"voteRuler\": \"1\",\n       \"host\": \"1\",\n       \"telephone\": \"1\",\n       \"status\": 1,\n       \"visitNum\": 15,\n         \"voteMax\":7,\n       \"voteMin\":1,\n       \"voteSum\": 2,\n       \"startTime\": \"2018-09-25 00:00:00\",\n       \"endTime\": \"2018-09-25 00:00:00\"\n   }\n]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./VoteApi.java",
    "groupTitle": "vote"
  },
  {
    "type": "get",
    "url": "/vote/getAction/special",
    "title": "获得特别推荐活动",
    "name": "getVoteActionHot",
    "group": "vote",
    "version": "0.0.1",
    "description": "<p>获得特别推荐活动</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "voteList",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "voteList.id",
            "description": "<p>活动ID</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.actionName",
            "description": "<p>活动名</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.actionImage",
            "description": "<p>活动图片路径</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.actionInfo",
            "description": "<p>活动简介</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.voteRuler",
            "description": "<p>活动规则</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.host",
            "description": "<p>活动举办方</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.telephone",
            "description": "<p>联系号码</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteList.status",
            "description": "<p>活动状态(0:已结束,1:正进行,2:未开始)</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteList.visistNum",
            "description": "<p>访问次数</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteList.voteSum",
            "description": "<p>投票总数</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteList.voteMax",
            "description": "<p>最多投票</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteList.voteMin",
            "description": "<p>最少投票</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.startTime",
            "description": "<p>开始时间</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.endTime",
            "description": "<p>截止时间</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n   \"code\": \"200\",\n   \"message\": \"\",\n   \"voteList\": [\n       {\n           \"id\": 1,\n    \t\t  \"actionName\": \"1\",\n           \"actionImage\": \"/test/test/test.jpg\",\n           \"actionIntro\": \"1\",\n           \"voteRuler\": \"1\",\n           \"host\": \"1\",\n           \"telephone\": \"1\",\n           \"status\": 1,\n           \"voteMin\": 1,\n\t\t      \"voteMax\": 7,\n           \"visitNum\": 18,\n           \"voteSum\": 2,\n           \"statTime\": \"2018-09-25 00:00:00\",\n           \"endTime\": \"2018-09-25 00:00:00\"\n       }\n   ]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./VoteApi.java",
    "groupTitle": "vote"
  },
  {
    "type": "get",
    "url": "/vote/getAction/hot",
    "title": "获得进行中的三个热门活动",
    "name": "getVoteActionHotList",
    "group": "vote",
    "version": "0.0.1",
    "description": "<p>获得进行中的三个热门活动</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "voteList",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "voteList.id",
            "description": "<p>活动ID</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.actionName",
            "description": "<p>活动名</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.actionImage",
            "description": "<p>活动图片路径</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.actionInfo",
            "description": "<p>活动简介</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.voteRuler",
            "description": "<p>活动规则</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.host",
            "description": "<p>活动举办方</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.telephone",
            "description": "<p>联系号码</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteList.status",
            "description": "<p>活动状态(0:已结束,1:正进行,2:未开始)</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteList.visistNum",
            "description": "<p>访问次数</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteList.voteSum",
            "description": "<p>投票总数</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteList.voteMax",
            "description": "<p>最多投票</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteList.voteMin",
            "description": "<p>最少投票</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.startTime",
            "description": "<p>开始时间</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteList.endTime",
            "description": "<p>截止时间</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n   \"code\": \"200\",\n   \"message\": \"\",\n   \"voteList\": [\n       {\n           \"id\": 1,\n    \t\t  \"actionName\": \"1\",\n           \"actionImage\": \"/test/test/test.jpg\",\n           \"actionIntro\": \"1\",\n           \"voteRuler\": \"1\",\n           \"host\": \"1\",\n           \"telephone\": \"1\",\n           \"status\": 1,\n           \"voteMin\": 1,\n\t\t      \"voteMax\": 7,\n           \"visitNum\": 18,\n           \"voteSum\": 2,\n           \"statTime\": \"2018-09-25 00:00:00\",\n           \"endTime\": \"2018-09-25 00:00:00\"\n       },\n       {\n           \"id\": 2,\n           \"actionName\": \"2\",\n           \"actionImage\": \"/test/test/ewrwer.jpg\",\n           \"actionIntro\": \"2\",\n           \"voteRuler\": \"2\",\n           \"host\": \"2\",\n           \"voteMin\": 1,\n\t\t      \"voteMax\": 7,\n           \"telephone\": \"2\",\n           \"status\": 1,\n           \"visitNum\": 2,\n           \"voteSum\": 2,\n           \"statTime\": \"2018-09-27 00:00:00\",\n           \"endTime\": \"2018-09-27 00:00:00\"\n       }\n   ]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./VoteApi.java",
    "groupTitle": "vote"
  },
  {
    "type": "get",
    "url": "/vote/record",
    "title": "我参与的投票",
    "name": "getVoteActionRecord",
    "group": "vote",
    "version": "0.0.1",
    "description": "<p>我参与的投票</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "long",
            "optional": false,
            "field": "id",
            "description": "<p>学生id</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageNo",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>页面大小</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageNo",
            "description": "<p>当前页</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>页面大小</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "pageCount",
            "description": "<p>总页数</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "recordCount",
            "description": "<p>总记录数</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "voteRecord",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "voteRecord.id",
            "description": "<p>活动ID</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteRecord.actionName",
            "description": "<p>活动名</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteRecord.actionImage",
            "description": "<p>活动图片路径</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteRecord.actionInfo",
            "description": "<p>活动简介</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteRecord.voteRuler",
            "description": "<p>活动规则</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteRecord.host",
            "description": "<p>活动举办方</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteRecord.telephone",
            "description": "<p>联系号码</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteRecord.status",
            "description": "<p>活动状态(0:已结束,1:正进行,2:未开始)</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteRecord.visistNum",
            "description": "<p>访问次数</p>"
          },
          {
            "group": "Success 200",
            "type": "int",
            "optional": false,
            "field": "voteRecord.voteSum",
            "description": "<p>投票总数</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteRecord.startTime",
            "description": "<p>活动开始时间</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteRecord.endTime",
            "description": "<p>活动截止时间</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteRecord.gmtCreated",
            "description": "<p>投票时间</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"pageNo\": 1,\n\"pageSize\": 10,\n\"pageCount\": 1,\n\"recordCount\": 2,\n\"voteRecord\": [\n   {\n       \"id\": 2,\n       \"actionName\": \"2\",\n       \"actionImage\": \"/test/test/ewrwer.jpg\",\n       \"actionIntro\": \"2\",\n       \"voteRuler\": \"2\",\n       \"host\": \"2\",\n       \"telephone\": \"2\",\n       \"status\": 1,\n       \"visitNum\": 2,\n       \"voteSum\": 2,\n       \"gmtCreated\": \"2018-09-27 00:00:00\",\n       \"gmtModified\": \"2018-09-27 00:00:00\",\n       \"gmtCreatedRecord\": \"2018-10-09 14:41:43\"\n   },\n   {\n       \"id\": 1,\n       \"actionName\": \"1\",\n       \"actionImage\": \"/test/test/test.jpg\",\n       \"actionIntro\": \"1\",\n       \"voteRuler\": \"1\",\n       \"host\": \"1\",\n       \"telephone\": \"1\",\n       \"status\": 1,\n       \"visitNum\": 15,\n       \"voteSum\": 2,\n       \"startTime\": \"2018-09-25 00:00:00\",\n       \"endTime\": \"2018-09-25 00:00:00\"\n       \"gmtCreated\": \"2018-10-02 14:41:43\"\n   }\n]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./VoteApi.java",
    "groupTitle": "vote"
  },
  {
    "type": "get",
    "url": "/vote/getAction/slide",
    "title": "获得投票界面轮播图",
    "name": "getVoteActionSlide",
    "group": "vote",
    "version": "0.0.1",
    "description": "<p>获得投票界面轮播图</p>",
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "object",
            "optional": false,
            "field": "items",
            "description": ""
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "items.actionId",
            "description": "<p>活动ID</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "items.picUrl",
            "description": "<p>图片地址</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n   \"code\": \"200\",\n   \"message\": \"\",\n   \"items\": [\n       {\n           \"actionId\": \"\",\n          \"picUrl\": \"http://www.sxscott.com/crazyBirdimg/poster1.png\"\n       },\n       {\n           \"actionId\": \"\",\n           \"picUrl\": \"http://www.sxscott.com/crazyBirdimg/poster2.png\"\n       },\n       {\n           \"actionId\": \"\",\n           \"picUrl\": \"http://www.sxscott.com/crazyBirdimg/poster3.png\"\n       }\n   ]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./VoteApi.java",
    "groupTitle": "vote"
  },
  {
    "type": "post",
    "url": "/vote/search",
    "title": "搜索候选人",
    "name": "searchActionDeatil",
    "group": "vote",
    "version": "0.0.1",
    "description": "<p>搜索候选人</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "long",
            "optional": false,
            "field": "actionId",
            "description": "<p>活动id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "peopleName",
            "description": "<p>名字</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "id",
            "description": "<p>候选人id</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "actionId",
            "description": "<p>所属活动id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "peopleName",
            "description": "<p>候选人名字</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "imageUrl",
            "description": "<p>候选人图片路径</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "className",
            "description": "<p>班级</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "serialId",
            "description": "<p>编号</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "num",
            "description": "<p>票数</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"id\": 1,\n\"actionId\": 1,\n\"peopleName\": \"嘿嘿嘿嘿\",\n\"imageUrl\": \"/test/test.jpg\",\n\"className\": \"嘿嘿嘿嘿\",\n\"serialId\":1,\n\"num\": 22\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./VoteApi.java",
    "groupTitle": "vote"
  },
  {
    "type": "get",
    "url": "/vote/search/{id}",
    "title": "获得单个候选人详情",
    "name": "searchActionDeatilById",
    "group": "vote",
    "version": "0.0.1",
    "description": "<p>获得单个候选人详情</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "id",
            "description": "<p>候选人id</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>结果码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>消息说明</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "id",
            "description": "<p>候选人id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "peopleName",
            "description": "<p>候选人名字</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "imageUrl",
            "description": "<p>候选人图片路径</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "className",
            "description": "<p>所属分类</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "detail",
            "description": "<p>详情</p>"
          },
          {
            "group": "Success 200",
            "type": "long",
            "optional": false,
            "field": "num",
            "description": "<p>票数</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"id\": 1,\n\"actionId\": 1,\n\"peopleName\": \"嘿嘿嘿嘿\",\n\"imageUrl\": \"/test/test.jpg\",\n\"className\": \"嘿嘿嘿嘿\",\n\"detail\" :\"\",\n\"num\": 22\n   }\n]\n}",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 400\n{\n    \"code\":\"400\",\n    \"message\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./VoteApi.java",
    "groupTitle": "vote"
  }
] });
