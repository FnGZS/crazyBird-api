package api;

/**
*
* @Type LostApi.java
* @Desc 元培小程序接口文档_失物招领模块
* @author wangbiao
* @date 2018年12月21日15:40:00
* @Version V1.0
*/
@Deprecated
public interface LostApi {
	  
    /**
	 * @api {get} /lost/lostMessage 获取失物招领类型
	 * @apiName getLostMessage
	 * @apiGroup lost
	 * @apiVersion 0.0.1
	 * @apiDescription 获取失物招领类型
	 * 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} LostTypeList
	 * @apiSuccess {long} LostTypeList.typeId ID
	 * @apiSuccess {String} LostTypeList.message 失物招领类型
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "",
     *"lostTypeList": [
     *   {
     *      "typeId": 0,
     *       "message": "失物招领"
     *   },
     *   {
     *       "typeId": 1,
     *       "message": "寻物启事"
     *   }
     *]
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
    void getLostMessage();
    
    /**
	 * @api {get} /lost/lostType 获取物品分类
	 * @apiName getLostType
	 * @apiGroup lost
	 * @apiVersion 0.0.1
	 * @apiDescription 获取物品分类
	 * 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} lostTypeList
	 * @apiSuccess {long} lostTypeList.typeId ID
	 * @apiSuccess {String} LostTypeList.typeName 失物类型
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "",
     *"lostTypeList": [
     *   {
     *      "typeId": 1,
     *       "typeName": "饭卡"
     *   },
     *   {
     *       "typeId": 2,
     *       "typeName": "证件"
     *   },
     *   {
     *       "typeId": 3,
     *      "typeName": "钥匙"
     *   },
     *   {
     *       "typeId": 4,
     *       "typeName": "雨伞"
     *   },
     *   {
     *       "typeId": 5,
     *       "typeName": "包包"
     *   },
     *   {
     *       "typeId": 6,
     *       "typeName": "电子产品"
     *   },
     *   {
     *       "typeId": 7,
     *       "typeName": "衣物"
     *   },
     *   {
     *       "typeId": 8,
     *       "typeName": "数码配件"
     *   },
     *   {
     *       "typeId": 9,
     *       "typeName": "水杯"
     *   },
     *   {
     *       "typeId": 10,
     *       "typeName": "U盘"
     *   },
     *   {
     *       "typeId": 11,
     *       "typeName": "书本"
     *   },
     *   {
     *       "typeId": 12,
     *       "typeName": "其他"
     *   },
     *   {
     *       "typeId": 31,
     *       "typeName": "1"
     *   }
     *]
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
    void getLostType();
    
    /**
	 * @api {get} /lost/getLostList 获得失物列表
	 * @apiName getLostList
	 * @apiGroup lost
	 * @apiVersion 0.0.1
	 * @apiDescription 获得失物列表
	 * 
	 * @apiParam {int} orderByType  排序规则
	 * @apiParam {int} pageNo  当前页
	 * @apiParam {int} pageSize  页面大小
	 * @apiParam {int} typeId  页面大小
	 * @apiParam {String} key  页面大小
	 * @apiParam {int} messageId  页面大小
	 * @apiParam {Long} publisher  页面大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} pageNo 当前页
	 * @apiSuccess {int} pageSize 页面大小
	 * @apiSuccess {int} pageCount总页数
	 * @apiSuccess {int} recordCount总记录数
	 * @apiSuccess {object} items
	 * @apiSuccess {int} items.id ID
	 * @apiSuccess {String} items.title 题目
	 * @apiSuccess {String} items.personal 个人信息
	 * @apiSuccess {String} items.titlePic 题目图片
	 * @apiSuccess {int} items.publisher 发布人id
	 * @apiSuccess {String} items.foundPic 图片
	 * @apiSuccess {String} items.content 内容
	 * @apiSuccess {String} items.contact 联系方式
	 * @apiSuccess {String} items.address 地址
	 * @apiSuccess {int} items.messageId 信息类别（失物，招领）
	 * @apiSuccess {int} items.typeId 失物标题
	 * @apiSuccess {String} items.typeName 类别
	 * @apiSuccess {int} items.isExamine 审核状态
	 * @apiSuccess {int} items.brow 浏览量
	 * @apiSuccess {int} items.isSolve 解决情况
	 * @apiSuccess {String} items.year 
	 * @apiSuccess {String} items.day 
	 * @apiSuccess {String} items.minute 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": null,
     *"pageNo": 1,
     *"pageSize": 20,
     *"pageCount": 3,
     *"recordCount": 48,
     *"items": [
     *   {
     *       "id": 119,
     *       "title": "2",
     *       "personal": "",
     *       "titlePic": "2",
     *       "publisher": 0,
     *       "foundPic": "2",
     *       "content": "2",
     *       "contact": "2",
     *       "address": "2",
     *       "messageId": 2,
     *       "typeId": 2,
     *       "typeName": "证件",
     *       "isExamine": 0,
     *       "brow": 0,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-20 ",
     *       "minute": "20:17"
     *   },
     *   {
     *       "id": 117,
     *       "title": "饭卡",
     *       "personal": "[]",
     *       "titlePic": "",
     *       "publisher": 0,
     *       "foundPic": "[]",
     *       "content": "",
     *       "contact": "17857058385",
     *       "address": "绍兴文理学院元培学院(镜湖校区)",
     *       "messageId": 0,
     *       "typeId": 3,
     *       "typeName": "钥匙",
     *       "isExamine": 0,
     *       "brow": 6,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-18 ",
     *       "minute": "08:52"
     *   },
     *   {
     *       "id": 116,
     *       "title": "aaa",
     *       "personal": "[]",
     *       "titlePic": "https://www.sxscott.com/crazyBirdimg/article/article_20181217192023003.jpg",
     *       "publisher": 0,
     *       "foundPic": "[\"https://www.sxscott.com/crazyBirdimg/article/article_20181217192023003.jpg\"]",
     *       "content": "qq\nqqq",
     *       "contact": "qqqqq",
     *       "address": "绍兴文理学院元培学院(镜湖校区)",
     *       "messageId": 0,
     *       "typeId": 6,
     *       "typeName": "电子产品",
     *       "isExamine": 0,
     *       "brow": 6,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-17 ",
     *       "minute": "19:20"
     *   },
     *   {
     *       "id": 115,
     *       "title": "1111",
     *       "personal": "[]",
     *       "titlePic": "https://www.sxscott.com/crazyBirdimg/article/article_20181217191950003.jpg",
     *       "publisher": 0,
     *       "foundPic": "[\"https://www.sxscott.com/crazyBirdimg/article/article_20181217191950003.jpg\"]",
     *       "content": "",
     *       "contact": "qqq",
     *       "address": "绍兴文理学院元培学院(镜湖校区)",
     *       "messageId": 0,
     *       "typeId": 6,
     *       "typeName": "电子产品",
     *       "isExamine": 0,
     *       "brow": 2,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-17 ",
     *       "minute": "19:19"
     *   },
     *   {
     *       "id": 114,
     *       "title": "11111",
     *       "personal": "[]",
     *       "titlePic": "https://www.sxscott.com/crazyBirdimg/article/article_20181217191919003.jpg",
     *       "publisher": 0,
     *       "foundPic": "[\"https://www.sxscott.com/crazyBirdimg/article/article_20181217191919003.jpg\",\"https://www.sxscott.com/crazyBirdimg/article/article_20181217191919003.jpg\"]",
     *       "content": "",
     *       "contact": "qqq",
     *       "address": "绍兴文理学院元培学院(镜湖校区)",
     *       "messageId": 1,
     *       "typeId": 6,
     *       "typeName": "电子产品",
     *       "isExamine": 0,
     *       "brow": 2,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-17 ",
     *       "minute": "19:19"
     *   },
     *   {
     *       "id": 113,
     *       "title": "111",
     *       "personal": "[]",
     *       "titlePic": "https://www.sxscott.com/crazyBirdimg/article/article_20181217191827003.jpg",
     *       "publisher": 0,
     *       "foundPic": "[\"https://www.sxscott.com/crazyBirdimg/article/article_20181217191827003.jpg\"]",
     *       "content": "222",
     *       "contact": "qqq",
     *       "address": "绍兴文理学院元培学院(镜湖校区)",
     *       "messageId": 0,
     *       "typeId": 3,
     *       "typeName": "钥匙",
     *       "isExamine": 0,
     *       "brow": 2,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-17 ",
     *       "minute": "19:18"
     *   },
     *   {
     *       "id": 112,
     *       "title": "133",
     *       "personal": "[]",
     *       "titlePic": "https://www.sxscott.com/crazyBirdimg/article/article_20181217191610003.jpg",
     *       "publisher": 0,
     *       "foundPic": "[\"https://www.sxscott.com/crazyBirdimg/article/article_20181217191610003.jpg\"]",
     *       "content": "",
     *       "contact": "111",
     *       "address": "绍兴文理学院元培学院(镜湖校区)",
     *       "messageId": 0,
     *       "typeId": 3,
     *       "typeName": "钥匙",
     *       "isExamine": 0,
     *       "brow": 1,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-17 ",
     *       "minute": "19:16"
     *   },
     *   {
     *       "id": 111,
     *       "title": "12312312",
     *       "personal": "[]",
     *       "titlePic": "https://www.sxscott.com/crazyBirdimg/article/article_20181216180733003.jpg",
     *       "publisher": 0,
     *       "foundPic": "[\"https://www.sxscott.com/crazyBirdimg/article/article_20181216180733003.jpg\",\"https://www.sxscott.com/crazyBirdimg/article/article_20181216180735003.jpg\"]",
     *       "content": "123123123123",
     *       "contact": "11111",
     *       "address": "1231231231",
     *       "messageId": 0,
     *       "typeId": 7,
     *       "typeName": "衣物",
     *       "isExamine": 0,
     *       "brow": 5,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-16 ",
     *       "minute": "18:07"
     *   },
     *   {
     *       "id": 110,
     *       "title": "123",
     *       "personal": "[]",
     *       "titlePic": "",
     *       "publisher": 0,
     *       "foundPic": "[]",
     *       "content": "",
     *       "contact": "123123",
     *       "address": "123123123",
     *       "messageId": 0,
     *       "typeId": 7,
     *       "typeName": "衣物",
     *       "isExamine": 0,
     *       "brow": 4,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-16 ",
     *       "minute": "18:07"
     *   },
     *   {
     *       "id": 109,
     *       "title": "谁特么干的",
     *       "personal": "",
     *       "titlePic": "https://www.sxscott.com/crazyBirdimg/article/article_20181215145025003.jpg",
     *       "publisher": 0,
     *       "foundPic": "[\"https://www.sxscott.com/crazyBirdimg/article/article_20181215145025003.jpg\"]",
     *       "content": "",
     *       "contact": "去你妹",
     *       "address": "华元欢乐城",
     *       "messageId": 0,
     *       "typeId": 12,
     *       "typeName": "其他",
     *       "isExamine": 0,
     *       "brow": 94,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-15 ",
     *       "minute": "14:50"
     *   },
     *   {
     *       "id": 108,
     *       "title": "qqqq",
     *       "personal": "",
     *       "titlePic": "https://www.sxscott.com/crazyBirdimg/article/article_20181215121855003.jpg",
     *       "publisher": 0,
     *       "foundPic": "[\"https://www.sxscott.com/crazyBirdimg/article/article_20181215121855003.jpg\"]",
     *       "content": "",
     *       "contact": "1223",
     *       "address": "东海·水景城(杭州市余杭区)",
     *       "messageId": 0,
     *       "typeId": 12,
     *       "typeName": "其他",
     *       "isExamine": 0,
     *       "brow": 30,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-15 ",
     *       "minute": "12:18"
     *   },
     *   {
     *       "id": 107,
     *       "title": "123",
     *       "personal": "",
     *       "titlePic": "https://www.sxscott.com/crazyBirdimg/article/article_20181215121804003.png",
     *       "publisher": 0,
     *       "foundPic": "[\"https://www.sxscott.com/crazyBirdimg/article/article_20181215121804003.png\"]",
     *       "contact": "123123",
     *       "address": "123",
     *       "messageId": 0,
     *       "typeId": 12,
     *       "typeName": "其他",
     *       "isExamine": 0,
     *       "brow": 2,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-15 ",
     *       "minute": "12:18"
     *   },
     *   {
     *       "id": 106,
     *       "title": "1",
     *       "personal": "",
     *       "titlePic": "https://www.sxscott.com/crazyBirdimg/article/article_20181215121501003.jpg",
     *       "publisher": 0,
     *       "foundPic": "[\"https://www.sxscott.com/crazyBirdimg/article/article_20181215121501003.jpg\"]",
     *       "content": "",
     *       "contact": "1",
     *       "address": "1",
     *       "messageId": 0,
     *      "typeId": 12,
     *       "typeName": "其他",
     *       "isExamine": 0,
     *       "brow": 6,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-15 ",
     *       "minute": "12:15"
     *   },
     *   {
     *       "id": 105,
     *       "title": "66666",
     *       "personal": "",
     *       "titlePic": "https://www.sxscott.com/crazyBirdimg/article/article_20181214153847002.jpg",
     *       "publisher": 0,
     *       "foundPic": "[\"https://www.sxscott.com/crazyBirdimg/article/article_20181214153847002.jpg\"]",
     *       "content": "",
     *       "contact": "6666",
     *       "address": "66666",
     *       "messageId": 0,
     *       "typeId": 12,
     *       "typeName": "其他",
     *       "isExamine": 0,
     *       "brow": 4,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-14 ",
     *       "minute": "15:38"
     *   },
     *   {
     *       "id": 104,
     *       "title": "123123",
     *       "personal": "",
     *       "titlePic": "",
     *       "publisher": 0,
     *       "foundPic": "[]",
     *       "content": "1112312\n3\n12\n3\n12\n31\n23\n123",
     *       "contact": "18888888",
     *       "address": "绍兴市越城区委(延安路南)",
     *       "messageId": 0,
     *       "typeId": 7,
     *       "typeName": "衣物",
     *       "isExamine": 0,
     *       "brow": 5,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-14 ",
     *       "minute": "14:13"
     *   },
     *   {
     *       "id": 103,
     *       "title": "a安达市大所大所大所大所大所奥术大师大所",
     *       "personal": "",
     *       "titlePic": "https://www.sxscott.com/crazyBirdimg/article/article_20181214140956002.jpg",
     *       "publisher": 0,
     *       "foundPic": "[\"https://www.sxscott.com/crazyBirdimg/article/article_20181214140956002.jpg\"]",
     *       "content": "",
     *       "contact": "as阿萨德阿萨德阿萨德阿萨德as",
     *       "address": "奥术大师大所大所大所多啊啊",
     *       "messageId": 0,
     *       "typeId": 12,
     *       "typeName": "其他",
     *       "isExamine": 0,
     *       "brow": 2,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-14 ",
     *       "minute": "14:09"
     *   },
     *   {
     *       "id": 102,
     *       "title": "123",
     *       "personal": "",
     *       "titlePic": "",
     *       "publisher": 0,
     *       "foundPic": "[]",
     *       "content": "",
     *       "contact": "123123123",
     *       "address": "123123123",
     *       "messageId": 0,
     *       "typeId": 12,
     *       "typeName": "其他",
     *       "isExamine": 0,
     *       "brow": 4,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-14 ",
     *       "minute": "01:14"
     *   },
     *   {
     *       "id": 101,
     *       "title": "男神的饭卡",
     *       "personal": "",
     *       "titlePic": "https://www.sxscott.com/crazyBirdimg/article/article_20181213231047002.jpg",
     *       "publisher": 0,
     *       "foundPic": "[\"https://www.sxscott.com/crazyBirdimg/article/article_20181213231047002.jpg\"]",
     *       "content": "很帅",
     *       "contact": "你猜",
     *       "address": "环球壹号KTV夜总汇会所客房",
     *       "messageId": 0,
     *       "typeId": 1,
     *       "typeName": "饭卡",
     *       "isExamine": 0,
     *       "brow": 17,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-13 ",
     *       "minute": "23:10"
     *   },
     *   {
     *       "id": 100,
     *       "title": "123",
     *       "personal": "",
     *       "titlePic": "https://www.sxscott.com/crazyBirdimg/article/article_20181213230217002.jpg",
     *       "publisher": 0,
     *       "foundPic": "[\"https://www.sxscott.com/crazyBirdimg/article/article_20181213230217002.jpg\"]",
     *       "content": "",
     *       "contact": "123456",
     *       "address": "绍兴文理学院元培学院(镜湖校区)",
     *       "messageId": 0,
     *       "typeId": 8,
     *       "typeName": "数码配件",
     *       "isExamine": 0,
     *       "brow": 8,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-13 ",
     *       "minute": "23:02"
     *   },
     *   {
     *       "id": 99,
     *       "title": "考试作弊",
     *       "personal": "",
     *       "titlePic": "https://www.sxscott.com/crazyBirdimg/article/article_20181213230145002.gif",
     *       "publisher": 0,
     *       "foundPic": "[\"https://www.sxscott.com/crazyBirdimg/article/article_20181213230145002.gif\"]",
     *       "content": "",
     *       "contact": "1757058385",
     *       "address": "绍兴文理学院元培学院(镜湖校区)",
     *       "messageId": 0,
     *       "typeId": 12,
     *       "typeName": "其他",
     *       "isExamine": 0,
     *       "brow": 9,
     *       "isSolve": 0,
     *       "year": "2018",
     *       "day": "12-13 ",
     *       "minute": "23:01"
     *   }
     *]
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
    void getLostList();
    
    /**
	 * @api {get} /lost/lostDetails/{id} 失物详情
	 * @apiName getLostDetails
	 * @apiGroup lost
	 * @apiVersion 0.0.1
	 * @apiDescription 失物详情
	 * 
	 * @apiParam {long} id 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} details
	 * @apiSuccess {int} details.id ID
	 * @apiSuccess {String} details.title 题目
	 * @apiSuccess {String} details.personal 个人信息
	 * @apiSuccess {String} details.titlePic 题目图片
	 * @apiSuccess {int} details.publisher 发布人id
	 * @apiSuccess {String} details.foundPic 图片
	 * @apiSuccess {String} details.content 内容
	 * @apiSuccess {String} details.contact 联系方式
	 * @apiSuccess {String} details.address 地址
	 * @apiSuccess {int} details.messageId 信息类别（失物，招领）
	 * @apiSuccess {int} details.typeId 失物标题
	 * @apiSuccess {String} details.typeName 类别
	 * @apiSuccess {int} details.isExamine 审核状态
	 * @apiSuccess {int} details.brow 浏览量
	 * @apiSuccess {int} details.isSolve 解决情况
	 * @apiSuccess {String} details.year 
	 * @apiSuccess {String} details.day 
	 * @apiSuccess {String} details.minute 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "",
     *"details": {
     *   "id": 1,
     *   "title": "粉色hello kitty凯蒂猫卡包",
     *   "personal": "",
     *   "titlePic": "",
     *   "publisher": 701140111,
     *   "foundPic": "https://www.sxscott.com/crazyBirdimg/article/article1.jpg",
     *   "content": "本人不慎于2018年11月26日至30日丢失粉色hello kitty凯蒂猫卡包一只，内有身份证，社保卡，银行卡！如有捡拾者请归还于施主，万分着急！现金酬谢",
     *   "contact": "电话：12345678978",
     *   "address": "绍兴市越城区委(延安路南)",
     *   "messageId": 0,
     *   "typeId": 5,
     *   "typeName": "包包",
     *   "isExamine": 1,
     *   "brow": 19,
     *   "isSolve": 0,
     *   "year": "2018",
     *   "day": "12-07 ",
     *   "minute": "17:49"
     *}
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
    void getLostDetails();
    
    /**
	 * @api {post} /lost/lostInput 失物信息录入
	 * @apiName lostInput
	 * @apiGroup lost
	 * @apiVersion 0.0.1
	 * @apiDescription 失物信息录入
	 * 
	 * @apiParam {String} personal 个人信息
	 * @apiParam {String} title 题目
	 * @apiParam {String} titlePic 题目图片
	 * @apiParam {String} foundPic 图片
	 * @apiParam {String} content 内容
	 * @apiParam {String} contact 联系方式
	 * @apiParam {String} address 地址
	 * @apiParam {int} messageId 信息类别（失物，招领）
	 * @apiParam {int} typeId 失物标题
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "录入成功"
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
    void lostInput();
    
    /**
	 * @api {post} /lost/lostTypeInput 失物类型录入
	 * @apiName lostTypeInput
	 * @apiGroup lost
	 * @apiVersion 0.0.1
	 * @apiDescription 失物类型录入
	 * 
	 * @apiParam {String} typeName 实物名
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "录入成功"
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
    void lostTypeInput();
    
    /**
	 * @api {DELETE} /lost/LostTypeDelete/{id} 失物类型删除
	 * @apiName lostTypeDelete
	 * @apiGroup lost
	 * @apiVersion 0.0.1
	 * @apiDescription 失物类型删除
	 * 
	 * @apiParam {long} id 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "删除成功"
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
    void lostTypeDelete();
    
    /**
	 * @api {POST} /lost/lostTypeUpdate 失物类型修改
	 * @apiName lostTypeUpdate
	 * @apiGroup lost
	 * @apiVersion 0.0.1
	 * @apiDescription 失物类型修改
	 * 
	 * @apiParam {long} id 
	 * @apiParam {String} typeName 失物名
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Long} result 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "修改成功",
	 *"result": 0
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
    void lostTypeUpdate();
    
    /**
	 * @api {GET} /lost/lostDelete/{id} 删除发布的记录
	 * @apiName getLostDelete
	 * @apiGroup lost
	 * @apiVersion 0.0.1
	 * @apiDescription 删除发布的记录
	 * 
	 * @apiParam {long} id 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "删除成功"
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
    void getLostDelete();
    
    /**
	 * @api {POST} /lost/lostUpdate 失物信息更新
	 * @apiName lostUpdate
	 * @apiGroup lost
	 * @apiVersion 0.0.1
	 * @apiDescription 失物信息更新
	 * 
	 * @apiParam {long} id 
	 * @apiParam {String} personal 失物名
	 * @apiParam {String} title 题目
	 * @apiParam {String} titlePic 题目图片
	 * @apiParam {String} foundPic 图片
	 * @apiParam {String} content 内容
	 * @apiParam {String} contact 联系方式
	 * @apiParam {String} address 地址
	 * @apiParam {int} messageId 信息类别（失物，招领）
	 * @apiParam {int} typeId 类别
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Long} result 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "修改成功",
     *"result": 0
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
    void lostUpdate();
    
}
