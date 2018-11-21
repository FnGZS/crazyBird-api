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
	 * @apiParam {int} status  状态码(0:已结束,1:正进行,2:未开始 , 不传该参数为获得所有活动)
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
	 * @apiSuccess {String} voteList.gmtCreated 开始时间
	 * @apiSuccess {String} voteList.gmtModified截止时间 
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
	 * @api {post} /vote/action/add 添加投票活动
	 * @apiName addVoteAction
	 * @apiGroup vote
	 * @apiVersion 0.0.1
	 * @apiDescription 添加投票活动列表
	 * 
	 * @apiParam {String} actionName 活动名
	 * @apiParam {String} actionImage 活动图片路径
	 * @apiParam {String} actionInfo活动简介
	 * @apiParam {String} voteRuler 活动规则
 	 * @apiParam  {String} host活动举办方
	 * @apiParam {String} telephone 联系号码
	 * @apiParam {int} status 活动状态(0:已结束,1:正进行,2:未开始)
	 * @apiParam {int} visistNum 访问次数
	 * @apiParam {int} voteMax 最多投票
	 * @apiParam {int} voteMin 最少投票
	 * @apiParam {int} voteSum 投票总数
	 * @apiParam {String} startTime 开始时间
	 * @apiParam {String} endTime截止时间 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
   	 * "code": "200",
     * "message": "",
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
    void addVoteAction();
    
    /**
	 * @api {put} /vote/action/update 修改投票活动
	 * @apiName updateVoteAction
	 * @apiGroup vote
	 * @apiVersion 0.0.1
	 * @apiDescription 修改投票活动列表
	 * 
	 * @apiParam {Long} id 活动id
	 * @apiParam {String} actionName 活动名
	 * @apiParam {String} actionImage 活动图片路径
	 * @apiParam {String} actionInfo活动简介
	 * @apiParam {String} voteRuler 活动规则
 	 * @apiParam  {String} host活动举办方
	 * @apiParam {String} telephone 联系号码
	 * @apiParam {int} status 活动状态(0:已结束,1:正进行,2:未开始)
	 * @apiParam {int} visistNum 访问次数
	 * @apiParam {int} voteMax 最多投票
	 * @apiParam {int} voteMin 最少投票
	 * @apiParam {int} voteSum 投票总数
	 * @apiParam {String} startTime 开始时间
	 * @apiParam {String} endTime截止时间 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
   	 * "code": "200",
     * "message": "",
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
    void updateVoteAction();
    
    /**
	 * @api {delete} /vote/action/update 删除投票活动
	 * @apiName deleteVoteAction
	 * @apiGroup vote
	 * @apiVersion 0.0.1
	 * @apiDescription 删除投票活动列表
	 * 
	 * @apiParam {Long} id 活动id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
   	 * "code": "200",
     * "message": "",
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
    void deleteVoteAction();
    
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
   	 * @apiSuccess {object} voteDetailList 
   	 * @apiSuccess {long} voteDetailList.id 候选人id
   	 * @apiSuccess {long} voteDetailList.actionId所属活动id
   	 * @apiSuccess {String}  voteDetailList.peopleName 候选人名字
   	 * @apiSuccess {String}  voteDetailList.imageUrl 候选人图片路径
   	 * @apiSuccess {String}  voteDetailList.className 班级
   	 * @apiSuccess {String}  voteDetailList.detail 详情
   	 * @apiSuccess {long} voteDetailList.serialId 编号
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
     *        "detail":"",
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
   	 * @api {post} /vote/detail/add 添加活动详情(候选人)
   	 * @apiName addActionDetail
   	 * @apiGroup vote
   	 * @apiVersion 0.0.1
   	 * @apiDescription 添加活动详情
   	 * 
   	 * @apiParam {long} actionId所属活动id
   	 * @apiParam {String}  peopleName 候选人名字
   	 * @apiParam {String}  imageUrl 候选人图片路径
   	 * @apiParam {String} className 班级
   	 * @apiParam {String} detail 详情
   	 * @apiParam {long} serialId 编号
   	 * @apiParam {long} num 票数
   	 * 
   	 * @apiSuccess {String} code 结果码
   	 * @apiSuccess {String} message 消息说明
   	 * @apiSuccessExample Success-Response:
   	 * HTTP/1.1 200
   	 *{
     * "code": "200",
     * "message": "",
	 *}
   	 * @apiErrorExample Error-Response:
   	 * HTTP/1.1 400
   	 * {
   	 *     "code":"400",
   	 *     "message":""
   	 * }
   	 * 
   	 */
    void addActionDetail();
    
    /**
   	 * @api {put} /vote/detail/update 修改活动详情(候选人)
   	 * @apiName updateActionDetail
   	 * @apiGroup vote
   	 * @apiVersion 0.0.1
   	 * @apiDescription 修改活动详情
   	 * 
   	 * @apiParam {long} id 候选人id
   	 * @apiParam {long} actionId所属活动id
   	 * @apiParam {String}  peopleName 候选人名字
   	 * @apiParam {String}  imageUrl 候选人图片路径
   	 * @apiParam {String} className 班级
   	 * @apiParam {String} detail 详情
   	 * @apiParam {long} serialId 编号
   	 * @apiParam {long} num 票数
   	 * 
   	 * @apiSuccess {String} code 结果码
   	 * @apiSuccess {String} message 消息说明
   	 * @apiSuccessExample Success-Response:
   	 * HTTP/1.1 200
   	 *{
     * "code": "200",
     * "message": "",
	 *}
   	 * @apiErrorExample Error-Response:
   	 * HTTP/1.1 400
   	 * {
   	 *     "code":"400",
   	 *     "message":""
   	 * }
   	 * 
   	 */
    void updateActionDetail();
    
    /**
   	 * @api {delete} /vote/detail/delete 删除活动详情(候选人)
   	 * @apiName deleteActionDetail
   	 * @apiGroup vote
   	 * @apiVersion 0.0.1
   	 * @apiDescription 删除活动详情
   	 * 
   	 * @apiParam {long} id 候选人id
   	 * 
   	 * @apiSuccess {String} code 结果码
   	 * @apiSuccess {String} message 消息说明
   	 * @apiSuccessExample Success-Response:
   	 * HTTP/1.1 200
   	 *{
     * "code": "200",
     * "message": "",
	 *}
   	 * @apiErrorExample Error-Response:
   	 * HTTP/1.1 400
   	 * {
   	 *     "code":"400",
   	 *     "message":""
   	 * }
   	 * 
   	 */
    void deleteActionDetail();
    
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
   	 * @apiSuccess {String}  voteDetailList.className 班级
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
	 * @api {get} /vote/record 投票记录
	 * @apiName getVoteActionRecord
	 * @apiGroup vote
	 * @apiVersion 0.0.1
	 * @apiDescription 投票记录
	 * 
	 * @apiParam {long} id  id
	 * @apiParam {int} type 类型（1：用户的记录，2：投票的记录）
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
   	 * @api {get} /vote/getAction/hot 获得推荐活动
   	 * @apiName getVoteActionHotList
   	 * @apiGroup vote
   	 * @apiVersion 0.0.1
   	 * @apiDescription  获得推荐活动
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
	 * @apiSuccess {String} voteList.gmtCreated
	 * @apiSuccess {String} voteList.gmtModified
	 * @apiSuccess {int} voteList.type 类型(0:首页，1：投票界面)
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
     *            "type":1,
     *            "voteSum": 2,
     *            "gmtCreated":2018-09-25 00:00:00,
     *            "gmtModified":"2018-09-25 00:00:00",
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
    void getVoteActionHotList();
    
    /**
   	 * @api {get} /vote/slide/get 获得投票界面轮播图
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
     *            "picUrl": "http://www.sxscott.com/crazyBirdimg/poster1.png",
     *     		  "gmtcreated":"2018-11-03 14:54:50",
     *            "gmtModified":"2018-11-03 14:54:50"
     *        },
     *        {
     *            "actionId": "",
     *            "picUrl": "http://www.sxscott.com/crazyBirdimg/poster2.png",
     *            "gmtcreated":"2018-11-03 14:54:50",
     *            "gmtModified":"2018-11-03 14:54:50"
     *        },
     *        {
     *            "actionId": "",
     *            "picUrl": "http://www.sxscott.com/crazyBirdimg/poster3.png",
     *            "gmtcreated":"2018-11-03 14:54:50",
     *            "gmtModified":"2018-11-03 14:54:50"
     *          
     *        }
     *    ]
     *}
     * @apiErrorExample Error-Response:
   	 * HTTP/1.1 400
   	 * {
   	 *     "code":"400",
   	 *     "message":""
   	 * }
   	 */
    void getVoteActionSlide();
    
    /**
   	 * @api {put} /slide/update 修改投票界面轮播图
   	 * @apiName updateVoteActionSlide
   	 * @apiGroup vote
   	 * @apiVersion 0.0.1
   	 * @apiDescription 修改投票界面轮播图
   	 * 
   	 * @apiParam {int} id  轮播图id
   	 * @apiParam {long} actionId  活动id
	 * @apiParam {String} picUrl 图片路径
   	 * 
   	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
   	 * @apiSuccessExample Success-Response:
   	 * HTTP/1.1 200
     *{
     *    "code": "200",
     *    "message": "",
     *}
     * @apiErrorExample Error-Response:
   	 * HTTP/1.1 400
   	 * {
   	 *     "code":"400",
   	 *     "message":""
   	 * }
   	 */
    void updateVoteActionSlide();
    
    /**
   	 * @api {post} /slide/add 添加投票界面轮播图
   	 * @apiName addVoteActionSlide
   	 * @apiGroup vote
   	 * @apiVersion 0.0.1
   	 * @apiDescription 添加投票界面轮播图
   	 * 
   	 * @apiParam {int} id  轮播图id
   	 * @apiParam {long} actionId  活动id
	 * @apiParam {String} picUrl 图片路径
   	 * 
   	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
   	 * @apiSuccessExample Success-Response:
   	 * HTTP/1.1 200
     *{
     *    "code": "200",
     *    "message": "",
     *}
     * @apiErrorExample Error-Response:
   	 * HTTP/1.1 400
   	 * {
   	 *     "code":"400",
   	 *     "message":""
   	 * }
   	 */
    void addVoteActionSlide();
    
    /**
   	 * @api {delete} /slide/delete 删除投票界面轮播图
   	 * @apiName deleteVoteActionSlide
   	 * @apiGroup vote
   	 * @apiVersion 0.0.1
   	 * @apiDescription 删除投票界面轮播图
   	 * 
   	 * @apiParam {int} id  轮播图id
   	 * 
   	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
   	 * @apiSuccessExample Success-Response:
   	 * HTTP/1.1 200
     *{
     *    "code": "200",
     *    "message": "",
     *}
     * @apiErrorExample Error-Response:
   	 * HTTP/1.1 400
   	 * {
   	 *     "code":"400",
   	 *     "message":""
   	 * }
   	 */
    void deleteVoteActionSlide();
    
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
   	 * @apiSuccess {String} detail 详情
   	 * @apiSuccess {String} className 班级
   	 * 
   	 * @apiSuccess {long}  serialId 编号
   	 * @apiSuccess {long} voteDetailList.num 票数
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
     *  "detail":"",
     *  "serialId":1,
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