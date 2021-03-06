package api;

/**
*
* @Type affairs.java
* @Desc 元培小程序接口文档_时事模块
* @author zhaojw
* @date 2018年10月28日2:12:00
* @Version V1.0
*/
@Deprecated
public interface AffairsApi {

	/**
	 * @api {get} /affaris/affairsList  后台列表
	 * @apiName getAffairsList
	 * @apiGroup affaris
	 * @apiVersion 0.0.1
	 * @apiDescription  后台列表
	 * 
	 * @apiParam {Integer} typeId  时事类别id
	 * @apiParam {String} key  搜索的关键字
	 * @apiParam {Integer} pageNo  当前页
	 * @apiParam {Integer} pageSize   分页大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Integer} pageNo 当前页
	 * @apiSuccess {Integer} pageSize 分页大小
	 * @apiSuccess {Integer} pageCount 总页数
	 * @apiSuccess {Integer} recordCount 总记录数
	 * @apiSuccess {object} items 列表
	 * @apiSuccess {Long} id 时事id
	 * @apiSuccess {String} title 时事标题
	 * @apiSuccess {String} affairsPic 时事图片
	 * @apiSuccess {String} content 时事内容
	 * @apiSuccess {Long} typeId 时事类型
	 * @apiSuccess {Long} brows 浏览量
	 * @apiSuccess {String} subordinate 发布地
	 * @apiSuccess {String} gmtCreated 发布时间 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 * "code": "200",
	 * "message": "",
	 * "pageNo": 1,
	 * "pageSize": 20,
	 * "pageCount": 1,
	 * "recordCount": 10,
	 * "items": [
	 * 		{
	 *        "id": 10,
	 *        "title": "2018年我院省部级科研项目成绩喜人",
	 *        "affairsPic": "http://www.ypc.edu.cn/yp/images/f1.png", 
	 *        "content":"2018年我院省部级科研项目立项成绩喜人，截止2018年10月，我院共立项省部级项目7项，创历年省部级课题立项新高。近年来，学院高度重视科研工作，不断总结现有经验，积极组织项目申报动员工作。通过发动教师培育项目，组织教师参加选题讲座和技能培训，组织相关专家开展论证会议，大大提高科研人员的申报积极性和项目成功率。", 
	 *        "typeId": 2,
	 *        "brows": 1, 
	 *        "subordinate": "招就处", 
	 *        "gmtCreated": "2018-10-27 21:02:16.0" 
	 *    },
	 *    {
	 *        "id": 9,    
	 *        "title": "2018年我院省部级科研项目成绩喜人",         
	 *        "affairsPic": "http://www.ypc.edu.cn/yp/images/f1.png",         
	 *        "content":"2018年我院省部级科研项目立项成绩喜人，截止2018年10月，我院共立项省部级项目7项，创历年省部级课题立项新高。近年来，学院高度重视科研工作，不断总结现有经验，积极组织项目申报动员工作。通过发动教师培育项目，组织教师参加选题讲座和技能培训，组织相关专家开展论证会议，大大提高科研人员的申报积极性和项目成功率。",         
	 *        "typeId": 2,         
	 *        "brows": 1,         
	 *        "subordinate": "招就处",         
	 *        "gmtCreated": "2018-10-27 20:50:37.0"         
	 *    }   
	 *    ]
	 * }             
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getAffairsList();
	
	/**
	 * @api {get} /affaris/affairsDetails/{id} 时事详情
	 * @apiName affairsDetails
	 * @apiGroup affaris
	 * @apiVersion 0.0.1
	 * @apiDescription 时事详情
	 * 
	 * @apiParam {Long} id  时事id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Long} id 时事id
	 * @apiSuccess {String} title 时事标题
	 * @apiSuccess {String} affairsPic 时事图片
	 * @apiSuccess {String} content 时事内容
	 * @apiSuccess {Long} typeId 时事类型
	 * @apiSuccess {Long} brows 浏览量
	 * @apiSuccess {String} subordinate 发布地
	 * @apiSuccess {String} gmtCreated 发布时间 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 * "code": "200",
	 * "message": "",
	 * "id": 10,
	 * "title": "2018年我院省部级科研项目成绩喜人",
	 * "affairsPic": "http://www.ypc.edu.cn/yp/images/f1.png", 
	 * "content":"2018年我院省部级科研项目立项成绩喜人，截止2018年10月，我院共立项省部级项目7项，创历年省部级课题立项新高。近年来，学院高度重视科研工作，不断总结现有经验，积极组织项目申报动员工作。通过发动教师培育项目，组织教师参加选题讲座和技能培训，组织相关专家开展论证会议，大大提高科研人员的申报积极性和项目成功率。", 
	 * "typeId": 2,
	 * "brows": 1, 
	 * "subordinate": "招就处", 
	 * "gmtCreated": "2018-10-27 21:02:16.0" 
	 * }
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void affairsDetails();
	
	/**
	 * @api {get} /affaris/type  获取时事类别信息
	 * @apiName getAffairsType
	 * @apiGroup affaris
	 * @apiVersion 0.0.1
	 * @apiDescription  获取时事类别信息
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} tags 
	 * @apiSuccess {long} tags.typeid 类别id
	 * @apiSuccess {String} tags.typeName 类别名
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 * "code": "200",
	 * "message": "",
	 * "tags": [
	 *     {
	 *         "typeid": 1,
	 *         "typeName": "学校要闻"        
	 *     },       
	 *     {       
	 *         "typeid": 2, 
	 *         "typeName": "校区动态"         
	 *     }                 
	 *  ]
	 * }       
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getAffairsType();
	
	/**
	 * @api {get} /affaris/delete  删除时事
	 * @apiName addAffair
	 * @apiGroup affaris
	 * @apiVersion 0.0.1
	 * @apiDescription  删除时事
	 * 
	 * @apiParam {Long} id 时事id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Long} result 结果 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 * "code": "200",
	 * "message": "",
	 * "result": 1
	 * }
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void deleteAffair();
	
	/**
	 * @api {post} /affaris/update  修改时事
	 * @apiName updateAffair
	 * @apiGroup affaris
	 * @apiVersion 0.0.1
	 * @apiDescription  修改时事
	 * 
	 * @apiParam {Long} id 时事id
	 * @apiParam {String} title 时事标题
	 * @apiParam {String} affairsPic 时事图片
	 * @apiParam {String} content 时事内容
	 * @apiParam {Long} typeId 时事类型
	 * @apiParam {String} subordinate 发布地
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Long} result 结果 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 * "code": "200",
	 * "message": "",
	 * "result": 1
	 * }
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void updateAffair();
	
	/**
	 * @api {post} /affaris/addAffairs  添加时事
	 * @apiName addAffairs
	 * @apiGroup affaris
	 * @apiVersion 0.0.1
	 * @apiDescription  添加时事
	 * 
	 * @apiParam {String} title 时事标题
	 * @apiParam {String} affairsPic 时事图片
	 * @apiParam {String} content 时事内容
	 * @apiParam {Long} typeId 时事类型
	 * @apiParam {String} subordinate 发布地
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Long} result 结果 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 * "code": "200",
	 * "message": "",
	 * "result": 1
	 * }
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void addaffairs();
	
	/**
	 * @api {post} /affaris/addType  添加类别
	 * @apiName addAffairsType
	 * @apiGroup affaris
	 * @apiVersion 0.0.1
	 * @apiDescription  添加类别
	 * 
	 * @apiParam {String} typeName 类别名字
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Long} result 结果 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 * "code": "200",
	 * "message": "",
	 * "result": 1
	 * }
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void addAffairsType();
	
	/**
	 * @api {get} /affaris/deleteType  删除类别
	 * @apiName deleteAffairsType
	 * @apiGroup affaris
	 * @apiVersion 0.0.1
	 * @apiDescription  删除类别
	 * 
	 * @apiParam {Long} id 类别id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Long} result 结果 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 * "code": "200",
	 * "message": "",
	 * "result": 1
	 * }
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void deleteAffairsType();
}
