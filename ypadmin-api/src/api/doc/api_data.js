define({ "api": [
  {
    "type": "post",
    "url": "/affaris/addAffairs",
    "title": "添加时事",
    "name": "addAffair",
    "group": "affaris",
    "version": "0.0.1",
    "description": "<p>添加时事</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "title",
            "description": "<p>时事标题</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "affairsPic",
            "description": "<p>时事图片</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "content",
            "description": "<p>时事内容</p>"
          },
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "typeId",
            "description": "<p>时事类型</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "subordinate",
            "description": "<p>发布地</p>"
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
            "description": "<p>用户名</p>"
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
    "filename": "./AffairsApi.java",
    "groupTitle": "affaris"
  },
  {
    "type": "post",
    "url": "/affaris/delete",
    "title": "删除时事",
    "name": "addAffair",
    "group": "affaris",
    "version": "0.0.1",
    "description": "<p>删除时事</p>",
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
    "filename": "./AffairsApi.java",
    "groupTitle": "affaris"
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
    "url": "/affaris/affairsList",
    "title": "后台列表",
    "name": "getAffairsList",
    "group": "affaris",
    "version": "0.0.1",
    "description": "<p>后台列表</p>",
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
    "type": "post",
    "url": "/affaris/update",
    "title": "修改时事",
    "name": "updateAffair",
    "group": "affaris",
    "version": "0.0.1",
    "description": "<p>修改时事</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "id",
            "description": "<p>时事id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "title",
            "description": "<p>时事标题</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "affairsPic",
            "description": "<p>时事图片</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "content",
            "description": "<p>时事内容</p>"
          },
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "typeId",
            "description": "<p>时事类型</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "subordinate",
            "description": "<p>发布地</p>"
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
    "filename": "./AffairsApi.java",
    "groupTitle": "affaris"
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
            "field": "voteDetailList.content",
            "description": "<p>候选人介绍</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.branch",
            "description": "<p>分院</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.political",
            "description": "<p>政治面貌</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.scientific",
            "description": "<p>科研例项</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.className",
            "description": "<p>班级</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.post",
            "description": "<p>职务</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.compete",
            "description": "<p>学科竞赛</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.honor",
            "description": "<p>获奖荣誉</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.story",
            "description": "<p>事迹</p>"
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
            "type": "String",
            "optional": false,
            "field": "voteDetailList.recommend",
            "description": "<p>推荐词</p>"
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
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"id\": 0,\n\"actionName\": \"1\",\n\"actionIntro\": \"1\",\n\"voteRuler\": \"1\",\n\"actionImage\": \"/test/test/test.jpg\",\n\"host\": \"1\",\n\"telephone\": \"1\",\n\"status\": 1,\n\"visitNum\": 17,\n\"voteSum\": 2,\n\"startTime\": \"2018-09-25 00:00:00\",\n\"endTime\": \"2018-09-25 00:00:00\",\n\"voteDetailList\": [\n   {\n       \"id\": 1,\n       \"actionId\": 1,\n       \"peopleName\": \"嘿嘿嘿嘿\",\n       \"imageUrl\": \"/test/test.jpg\",\n       \"content\": \"嘿嘿嘿嘿\",\n       \"branch\": \"嘿嘿嘿嘿\",\n       \"political\": \"嘿嘿嘿嘿\",\n       \"className\": \"嘿嘿嘿嘿\",\n       \"voteMax\":7,\n       \"voteMin\":1,\n       \"post\": \"嘿嘿嘿嘿\",\n       \"compete\": \"嘿嘿嘿嘿\",\n       \"honor\": \"嘿嘿嘿嘿\",\n       \"story\": \"嘿嘿嘿嘿\",\n       \"recommend\": \"嘿嘿嘿嘿\",\n       \"serialId\":1,\n       \"num\": 22\n   }\n]\n}",
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
            "field": "voteDetailList.content",
            "description": "<p>候选人介绍</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.branch",
            "description": "<p>分院</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.political",
            "description": "<p>政治面貌</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.scientific",
            "description": "<p>科研例项</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.className",
            "description": "<p>班级</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.post",
            "description": "<p>职务</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.compete",
            "description": "<p>学科竞赛</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.honor",
            "description": "<p>获奖荣誉</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "voteDetailList.story",
            "description": "<p>事迹</p>"
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
            "type": "String",
            "optional": false,
            "field": "voteDetailList.recommend",
            "description": "<p>推荐词</p>"
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
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"voteDetailList\": [\n   {\n       \"id\": 1,\n       \"actionId\": 1,\n       \"peopleName\": \"嘿嘿嘿嘿\",\n       \"imageUrl\": \"/test/test.jpg\",\n       \"content\": \"嘿嘿嘿嘿\",\n       \"branch\": \"嘿嘿嘿嘿\",\n       \"political\": \"嘿嘿嘿嘿\",\n       \"className\": \"嘿嘿嘿嘿\",\n       \"post\": \"嘿嘿嘿嘿\",\n       \"compete\": \"嘿嘿嘿嘿\",\n       \"honor\": \"嘿嘿嘿嘿\",\n       \"story\": \"嘿嘿嘿嘿\",\n       \"serialId\" 1,\n       \"recommend\": \"嘿嘿嘿嘿\",\n       \"num\": 22\n   }\n]\n}",
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
            "field": "content",
            "description": "<p>候选人介绍</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "branch",
            "description": "<p>分院</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "political",
            "description": "<p>政治面貌</p>"
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
            "type": "String",
            "optional": false,
            "field": "post",
            "description": "<p>职务</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "compete",
            "description": "<p>学科竞赛</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "honor",
            "description": "<p>获奖荣誉</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "scientific",
            "description": "<p>科研例项</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "story",
            "description": "<p>事迹</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "recommend",
            "description": "<p>推荐词</p>"
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
            "field": "voteDetailList.num",
            "description": "<p>票数</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200\n{\n\"code\": \"200\",\n\"message\": \"\",\n\"id\": 1,\n\"actionId\": 1,\n\"peopleName\": \"嘿嘿嘿嘿\",\n\"imageUrl\": \"/test/test.jpg\",\n\"content\": \"嘿嘿嘿嘿\",\n\"branch\": \"嘿嘿嘿嘿\",\n\"political\": \"嘿嘿嘿嘿\",\n\"className\": \"嘿嘿嘿嘿\",\n\"post\": \"嘿嘿嘿嘿\",\n\"compete\": \"嘿嘿嘿嘿\",\n\"honor\": \"嘿嘿嘿嘿\",\n\"serialId\":1,\n\"scientific\":\"ahahah\",\n\"story\": \"嘿嘿嘿嘿\",\n\"recommend\": \"嘿嘿嘿嘿\",\n\"num\": 22\n}",
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
