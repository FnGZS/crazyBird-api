package api;

/**
 *
 * @Type VoteApi.java
 * @Desc 元培小程序接口文档_投票模块
 * @author zhengzc
 * @date 2018年10月1日18:12:00
 * @Version V1.0
 */
@Deprecated
public interface VoteApi {
  
    /**
	 * @api {post} /vote/getAction 获得投票活动列表
	 * @apiName getActionList
	 * @apiGroup vote
	 * @apiVersion 0.0.1
	 * @apiDescription 获得投票活动列表
	 * 
	 * @apiParam {int} status  状态码(0:已结束,1:正进行,2:未开始)
	 * @apiParam {int} pageNo  当前页
	 * @apiParam {int} pageSize  页面大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} pageNo 当前页
	 * @apiSuccess {int} pageSize 页面大小
	 * @apiSuccess {int} pageCount总页数
	 * @apiSuccess {int} recordCount总记录数
	 * @apiSuccess {object} voteList
	 * @apiSuccess {long} voteList.id 活动ID
	 * @apiSuccess {String} voteList.actionName 活动名
	 * @apiSuccess {String} voteList.actionImage 活动图片路径
	 * @apiSuccess {String} voteList.actionInfo活动简介
	 * @apiSuccess {String} voteList.voteRuler 活动规则
	 * @apiSuccess {String} voteList.host活动举办方
	 * @apiSuccess {String} voteList.telephone 联系号码
	 * @apiSuccess {int} voteList.status 活动状态(0:已结束,1:正进行,2:未开始)
	 * @apiSuccess {int} voteList.visistNum 访问次数
	 * @apiSuccess {int} voteList.voteMax 最多投票
	 * @apiSuccess {int} voteList.voteMin 最少投票
	 * @apiSuccess {int} voteList.voteSum 投票总数
	 * @apiSuccess {String} voteList.startTime 开始时间
	 * @apiSuccess {String} voteList.endTime截止时间 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
   	 * "code": "200",
     * "message": "",
     * "pageNo": 1,
     * "pageSize": 10,
	 * "pageCount": 1,
     * "recordCount": 2,
     * "voteList": [
     *    {
     *        "id": 2,
     *        "actionName": "2",
     *        "actionImage": "/test/test/ewrwer.jpg",
     *        "actionIntro": "2",
     *        "voteRuler": "2",
     *        "host": "2",
     *        "telephone": "2",
     *        "status": 1,
     *        "voteMax":7,
     *        "voteMin":1,
     *        "visitNum": 2,
     *        "voteSum": 2,
     *        "startTime": "2018-09-27 00:00:00",
     *        "endTimed": "2018-09-27 00:00:00"
     *    },
     *    {
     *        "id": 1,
     *        "actionName": "1",
     *        "actionImage": "/test/test/test.jpg",
     *        "actionIntro": "1",
     *        "voteRuler": "1",
     *        "host": "1",
     *        "telephone": "1",
     *        "status": 1,
     *        "visitNum": 15,
     *          "voteMax":7,
     *        "voteMin":1,
     *        "voteSum": 2,
     *        "startTime": "2018-09-25 00:00:00",
     *        "endTime": "2018-09-25 00:00:00"
     *    }
     * ]
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
    void getActionList();
    
    /**
   	 * @api {get} /vote/getAction/detail/{id} 获得投票详情
   	 * @apiName getActionDetail
   	 * @apiGroup vote
   	 * @apiVersion 0.0.1
   	 * @apiDescription 获得活动详情
   	 * 
   	 * @apiParam {Long} id  活动id
   	 * 
   	 * @apiSuccess {String} code 结果码
   	 * @apiSuccess {String} message 消息说明
   	 * @apiSuccess {long} id 活动ID
   	 * @apiSuccess {String} actionName 活动名
   	 * @apiSuccess {String} actionImage 图片路径
   	 * @apiSuccess {String} actionInfo活动简介
   	 * @apiSuccess {String} voteRuler 活动规则
   	 * @apiSuccess {String} host活动举办方
   	 * @apiSuccess {String} telephone 联系号码
   	 * @apiSuccess {int} status 活动状态(0:已结束,1:正进行,2:未开始)
   	 * @apiSuccess {int} visistNum 访问次数
   	 * @apiSuccess {int} voteSum 投票总数
   	 * @apiSuccess {int} voteMax 最多投票
	 * @apiSuccess {int} votemin 最少投票
   	 * @apiSuccess {String} startTIme 开始时间
   	 * @apiSuccess {long} timeDiff时间差（毫秒）
   	 * @apiSuccess {String} endTime截止时间 
   	 * @apiSuccess {object} voteDetailList 
   	 * @apiSuccess {long} voteDetailList.id 候选人id
   	 * @apiSuccess {long} voteDetailList.actionId所属活动id
   	 * @apiSuccess {String}  voteDetailList.peopleName 候选人名字
   	 * @apiSuccess {String}  voteDetailList.imageUrl 候选人图片路径
   	 * @apiSuccess {String}  voteDetailList.className 所属分类
   	 * @apiSuccess {long} voteDetailList.serialId 编号
   	 * @apiSuccess {long} voteDetailList.num 票数
   	 * @apiSuccessExample Success-Response:
   	 * HTTP/1.1 200
   	 *{
     * "code": "200",
     * "message": "",
     * "id": 0,
     * "actionName": "1",
     * "actionIntro": "1",
     * "voteRuler": "1",
     * "actionImage": "/test/test/test.jpg",
     * "host": "1",
     * "telephone": "1",
     * "status": 1,
     * "voteMax":7,
     * "voteMin":1,
     * "visitNum": 17,
     * "voteSum": 2,
     * "startTime": "2018-09-25 00:00:00",
     * "endTime": "2018-09-25 00:00:00",
     * "voteDetailList": [
     *    {
     *        "id": 1,
     *        "actionId": 1,
     *        "peopleName": "嘿嘿嘿嘿",
     *        "imageUrl": "/test/test.jpg",
     *        "className": "嘿嘿嘿嘿",
     *        "compete": "嘿嘿嘿嘿",
     *        "serialId":1,
     *        "num": 22
     *    }
     * ]
	 *}
   	 * @apiErrorExample Error-Response:
   	 * HTTP/1.1 400
   	 * {
   	 *     "code":"400",
   	 *     "message":""
   	 * }
   	 * 
   	 */
    void getActionDetail();
    
    /**
   	 * @api {get} /vote/search/{id} 获得单个候选人详情
   	 * @apiName searchActionDeatilById
   	 * @apiGroup vote
   	 * @apiVersion 0.0.1
   	 * @apiDescription 获得单个候选人详情
   	 * 
   	 * @apiParam {Long} id  候选人id
   	 * 
   	 * @apiSuccess {String} code 结果码
   	 * @apiSuccess {String} message 消息说明
   	 * @apiSuccess {long} id 候选人id
   	 * @apiSuccess {String}  peopleName 候选人名字
   	 * @apiSuccess {String}  imageUrl 候选人图片路径
   	 * @apiSuccess {String}  className 所属分类
   	 * @apiSuccess {String}  detail 详情
   	 * @apiSuccess {long} num 票数
   	 * @apiSuccessExample Success-Response:
   	 * HTTP/1.1 200
   	 *{
     * "code": "200",
     * "message": "",
     * "id": 1,
     * "actionId": 1,
     * "peopleName": "嘿嘿嘿嘿",
     * "imageUrl": "/test/test.jpg",
     * "className": "嘿嘿嘿嘿",
     * "detail" :"",
     * "num": 22
     *    }
     * ]
	 *}
   	 * @apiErrorExample Error-Response:
   	 * HTTP/1.1 400
   	 * {
   	 *     "code":"400",
   	 *     "message":""
   	 * }
   	 * 
   	 */
    
   void searchActionDeatilById();
      
    /**
   	 * @api {get} /vote/getAction/detail/rank/{id} 获得投票排名详情
   	 * @apiName getActionDetailByRank
   	 * @apiGroup vote
   	 * @apiVersion 0.0.1
   	 * @apiDescription 获得投票排名详情
   	 * 
   	 * @apiParam {Long} id  活动id
   	 * 
   	 * @apiSuccess {String} code 结果码
   	 * @apiSuccess {String} message 消息说明
   	 * @apiSuccess {object} voteDetailList 
   	 * @apiSuccess {long} voteDetailList.id 候选人id
   	 * @apiSuccess {long} voteDetailList.actionId所属活动id
   	 * @apiSuccess {String}  voteDetailList.peopleName 候选人名字
   	 * @apiSuccess {String}  voteDetailList.imageUrl 候选人图片路径
   	 * @apiSuccess {String}  voteDetailList.className 所属分类
   	 * @apiSuccess {long} 	 voteDetailList.serialId 编号
   	 * @apiSuccess {long} voteDetailList.num 票数
   	 * @apiSuccessExample Success-Response:
   	 * HTTP/1.1 200
   	 *{
     * "code": "200",
     * "message": "",
     * "voteDetailList": [
     *    {
     *        "id": 1,
     *        "actionId": 1,
     *        "peopleName": "嘿嘿嘿嘿",
     *        "imageUrl": "/test/test.jpg",
     *        "className": "嘿嘿嘿嘿",
     *        "serialId" 1,
     *        "num": 22
     *    }
     * ]
	 *}
   	 * @apiErrorExample Error-Response:
   	 * HTTP/1.1 400
   	 * {
   	 *     "code":"400",
   	 *     "message":""
   	 * }
   	 * 
   	 */
    void getActionDetailByRank();
    
    /**
   	 * @api {post} /vote/create 投票
   	 * @apiName createVoteDetailNum()
   	 * @apiGroup vote
   	 * @apiVersion 0.0.1
   	 * @apiDescription 投票
   	 * 
   	 * @apiParam {long} actionId  活动id
   	 * @apiParam {long} studentId 投票人id
   	 * @apiParam {long} sum 投的票数
   	 * @apiParam {String} detail 投票明细(2,4,5)
   	 * 
   	 * @apiSuccess {String} code 结果码
   	 * @apiSuccess {String} message 消息说明
   	 * @apiSuccessExample Success-Response:
   	 * HTTP/1.1 200
   	 *{
     * 
     *     "code": "200",
     *	   "message": "投票成功"
	 *}
   	 * @apiErrorExample Error-Response:
   	 * HTTP/1.1 400
   	 * {
   	 *     "code":"400",
   	 *     "message":"你已经投过票"
   	 * }
   	 * 
   	 */
    void createVoteDetailNum();
      
    /**
	 * @api {get} /vote/record 我参与的投票
	 * @apiName getVoteActionRecord
	 * @apiGroup vote
	 * @apiVersion 0.0.1
	 * @apiDescription 我参与的投票
	 * 
	 * @apiParam {long} id  学生id
	 * @apiParam {int} pageNo  当前页
	 * @apiParam {int} pageSize  页面大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} pageNo 当前页
	 * @apiSuccess {int} pageSize 页面大小
	 * @apiSuccess {int} pageCount总页数
	 * @apiSuccess {int} recordCount总记录数
	 * @apiSuccess {object} voteRecord
	 * @apiSuccess {long} voteRecord.id 活动ID
	 * @apiSuccess {String} voteRecord.actionName 活动名
	 * @apiSuccess {String} voteRecord.actionImage 活动图片路径
	 * @apiSuccess {String} voteRecord.actionInfo活动简介
	 * @apiSuccess {String} voteRecord.voteRuler 活动规则
	 * @apiSuccess {String} voteRecord.host活动举办方
	 * @apiSuccess {String} voteRecord.telephone 联系号码
	 * @apiSuccess {int} voteRecord.status 活动状态(0:已结束,1:正进行,2:未开始)
	 * @apiSuccess {int} voteRecord.visistNum 访问次数
	 * @apiSuccess {int} voteRecord.voteSum 投票总数
	 * @apiSuccess {String} voteRecord.startTime 活动开始时间
	 * @apiSuccess {String} voteRecord.endTime活动截止时间 
	 * @apiSuccess {String} voteRecord.gmtCreated投票时间 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
   	 * "code": "200",
     * "message": "",
     * "pageNo": 1,
     * "pageSize": 10,
	 * "pageCount": 1,
     * "recordCount": 2,
     * "voteRecord": [
     *    {
     *        "id": 2,
     *        "actionName": "2",
     *        "actionImage": "/test/test/ewrwer.jpg",
     *        "actionIntro": "2",
     *        "voteRuler": "2",
     *        "host": "2",
     *        "telephone": "2",
     *        "status": 1,
     *        "visitNum": 2,
     *        "voteSum": 2,
     *        "gmtCreated": "2018-09-27 00:00:00",
     *        "gmtModified": "2018-09-27 00:00:00",
     *        "gmtCreatedRecord": "2018-10-09 14:41:43"
     *    },
     *    {
     *        "id": 1,
     *        "actionName": "1",
     *        "actionImage": "/test/test/test.jpg",
     *        "actionIntro": "1",
     *        "voteRuler": "1",
     *        "host": "1",
     *        "telephone": "1",
     *        "status": 1,
     *        "visitNum": 15,
     *        "voteSum": 2,
     *        "startTime": "2018-09-25 00:00:00",
     *        "endTime": "2018-09-25 00:00:00"
     *        "gmtCreated": "2018-10-02 14:41:43"
     *    }
     * ]
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */  
    void getVoteActionRecord();
    
    /**
   	 * @api {get} /vote/getAction/hot 获得进行中的三个热门活动
   	 * @apiName getVoteActionHotList
   	 * @apiGroup vote
   	 * @apiVersion 0.0.1
   	 * @apiDescription 获得进行中的三个热门活动
   	 * 
   	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} voteList
	 * @apiSuccess {long} voteList.id 活动ID
	 * @apiSuccess {String} voteList.actionName 活动名
	 * @apiSuccess {String} voteList.actionImage 活动图片路径
	 * @apiSuccess {String} voteList.actionInfo活动简介
	 * @apiSuccess {String} voteList.voteRuler 活动规则
	 * @apiSuccess {String} voteList.host活动举办方
	 * @apiSuccess {String} voteList.telephone 联系号码
	 * @apiSuccess {int} voteList.status 活动状态(0:已结束,1:正进行,2:未开始)
	 * @apiSuccess {int} voteList.visistNum 访问次数
	 * @apiSuccess {int} voteList.voteSum 投票总数
	 * @apiSuccess {int} voteList.voteMax 最多投票
	 * @apiSuccess {int} voteList.voteMin 最少投票
	 * @apiSuccess {String} voteList.startTime 开始时间
	 * @apiSuccess {String} voteList.endTime截止时间 
   	 * @apiSuccessExample Success-Response:
   	 * HTTP/1.1 200
     * {
     *    "code": "200",
     *    "message": "",
     *    "voteList": [
     *        {
     *            "id": 1,
     *     		  "actionName": "1",
     *            "actionImage": "/test/test/test.jpg",
     *            "actionIntro": "1",
     *            "voteRuler": "1",
     *            "host": "1",
     *            "telephone": "1",
     *            "status": 1,
     *            "voteMin": 1,
     * 		      "voteMax": 7,
     *            "visitNum": 18,
     *            "voteSum": 2,
     *            "statTime": "2018-09-25 00:00:00",
     *            "endTime": "2018-09-25 00:00:00"
     *        },
     *        {
     *            "id": 2,
     *            "actionName": "2",
     *            "actionImage": "/test/test/ewrwer.jpg",
     *            "actionIntro": "2",
     *            "voteRuler": "2",
     *            "host": "2",
     *            "voteMin": 1,
     * 		      "voteMax": 7,
     *            "telephone": "2",
     *            "status": 1,
     *            "visitNum": 2,
     *            "voteSum": 2,
     *            "statTime": "2018-09-27 00:00:00",
     *            "endTime": "2018-09-27 00:00:00"
     *        }
     *    ]
     *}   	 
     * @apiErrorExample Error-Response:
   	 * HTTP/1.1 400
   	 * {
   	 *     "code":"400",
   	 *     "message":""
   	 * }
   	 * 
   	 */
    void getVoteActionHotList();
    
    /**
   	 * @api {get} /vote/getAction/special 获得特别推荐活动
   	 * @apiName getVoteActionHot
   	 * @apiGroup vote
   	 * @apiVersion 0.0.1
   	 * @apiDescription  获得特别推荐活动
   	 * 
   	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} voteList
	 * @apiSuccess {long} voteList.id 活动ID
	 * @apiSuccess {String} voteList.actionName 活动名
	 * @apiSuccess {String} voteList.actionImage 活动图片路径
	 * @apiSuccess {String} voteList.actionInfo活动简介
	 * @apiSuccess {String} voteList.voteRuler 活动规则
	 * @apiSuccess {String} voteList.host活动举办方
	 * @apiSuccess {String} voteList.telephone 联系号码
	 * @apiSuccess {int} voteList.status 活动状态(0:已结束,1:正进行,2:未开始)
	 * @apiSuccess {int} voteList.visistNum 访问次数
	 * @apiSuccess {int} voteList.voteSum 投票总数
	 * @apiSuccess {int} voteList.voteMax 最多投票
	 * @apiSuccess {int} voteList.voteMin 最少投票
	 * @apiSuccess {String} voteList.startTime 开始时间
	 * @apiSuccess {String} voteList.endTime截止时间 
   	 * @apiSuccessExample Success-Response:
   	 * HTTP/1.1 200
     * {
     *    "code": "200",
     *    "message": "",
     *    "voteList": [
     *        {
     *            "id": 1,
     *     		  "actionName": "1",
     *            "actionImage": "/test/test/test.jpg",
     *            "actionIntro": "1",
     *            "voteRuler": "1",
     *            "host": "1",
     *            "telephone": "1",
     *            "status": 1,
     *            "voteMin": 1,
     * 		      "voteMax": 7,
     *            "visitNum": 18,
     *            "voteSum": 2,
     *            "statTime": "2018-09-25 00:00:00",
     *            "endTime": "2018-09-25 00:00:00"
     *        }
     *    ]
     *}   	 
     * @apiErrorExample Error-Response:
   	 * HTTP/1.1 400
   	 * {
   	 *     "code":"400",
   	 *     "message":""
   	 * }
   	 * 
   	 */
    void getVoteActionHot();
    
    /**
   	 * @api {get} /vote/getAction/slide 获得投票界面轮播图
   	 * @apiName getVoteActionSlide
   	 * @apiGroup vote
   	 * @apiVersion 0.0.1
   	 * @apiDescription 获得投票界面轮播图
   	 * 
   	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} items
	 * @apiSuccess {String} items.actionId 活动ID
	 * @apiSuccess {String} items.picUrl图片地址
   	 * @apiSuccessExample Success-Response:
   	 * HTTP/1.1 200
     *{
     *    "code": "200",
     *    "message": "",
     *    "items": [
     *        {
     *            "actionId": "",
     *           "picUrl": "http://www.sxscott.com/crazyBirdimg/poster1.png"
     *        },
     *        {
     *            "actionId": "",
     *            "picUrl": "http://www.sxscott.com/crazyBirdimg/poster2.png"
     *        },
     *        {
     *            "actionId": "",
     *            "picUrl": "http://www.sxscott.com/crazyBirdimg/poster3.png"
     *        }
     *    ]
     *}
     * @apiErrorExample Error-Response:
   	 * HTTP/1.1 400
   	 * {
   	 *     "code":"400",
   	 *     "message":""
   	 * }
   	 * 
   	 */
    void getVoteActionSlide();
    
    /**
	 * @api {post} /vote/check 检测投票
	 * @apiName checkVoteRecord
	 * @apiGroup vote
	 * @apiVersion 0.0.1
	 * @apiDescription 检测投票
	 * 
	 * @apiParam {long} studentId  学生id
	 * @apiParam {long} actionId  活动id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} status 状态码(0:未投票，1:已投票)
	 * @apiSuccess {String} detail 投票明细
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 *		"code":"200",
	 *	    "message": "你已经投过票",
     *		"status": 1,
     *		"detail": "1,2"
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
    void checkVoteRecord();
    
    /**
   	 * @api {post} /vote/search 搜索候选人
   	 * @apiName searchActionDeatil
   	 * @apiGroup vote
   	 * @apiVersion 0.0.1
   	 * @apiDescription 搜索候选人
   	 * 
   	 * @apiParam {long} actionId  活动id
   	 * @apiParam {String} peopleName  名字
   	 * 
   	 * @apiSuccess {String} code 结果码
   	 * @apiSuccess {String} message 消息说明
   	 * @apiSuccess {long} id 候选人id
   	 * @apiSuccess {long} actionId所属活动id
   	 * @apiSuccess {String} peopleName 候选人名字
   	 * @apiSuccess {String} imageUrl 候选人图片路径
   	 * @apiSuccess {String} className 班级
   	 * @apiSuccess {long}  serialId 编号
   	 * @apiSuccess {long}  num 票数
   	 * @apiSuccessExample Success-Response:
   	 * HTTP/1.1 200
   	 *{
     * "code": "200",
     * "message": "",
     * "id": 1,
     * "actionId": 1,
     * "peopleName": "嘿嘿嘿嘿",
     * "imageUrl": "/test/test.jpg",
     * "className": "嘿嘿嘿嘿",
     * "serialId":1,
     * "num": 22
	 *}
   	 * @apiErrorExample Error-Response:
   	 * HTTP/1.1 400
   	 * {
   	 *     "code":"400",
   	 *     "message":""
   	 * }
   	 */
    void searchActionDeatil();
    
}