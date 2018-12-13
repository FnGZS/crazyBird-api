package api;

/**
*
* @Type UserLogin.java
* @Desc 元培小程序接口文档_失物招领模块
* @author caixiao
* @date 2018年12月6日19:30:00
* @Version V1.0
*/
@Deprecated
public interface LostApi {

	/**
	 * @api {get} /lost/getLostList 获取失物列表
	 * @apiName getLostList
	 * @apiGroup lost
	 * @apiVersion 0.0.1
	 * @apiDescription 获取失物列表
	 * 
	 * @apiParam {Integer} typeId  失物类别id
	 * @apiParam {String} key  搜索的关键字
	 * @apiParam {Integer} messageId  失物物品类别id
	 * @apiParam {Long} publisher  当前账号id
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
	 * @apiSuccess {Integer} id 失物id
	 * @apiSuccess {String} title 失物标题
	 * @apiSuccess {Integer} publisher 失物发布者id
	 * @apiSuccess {String} foundPic 失物图片
	 * @apiSuccess {String} content 失物内容
	 * @apiSuccess {Integer} typeId 失物分类id
	 * @apiSuccess {Integer} isExamine 失物审核状态
	 * @apiSuccess {Integer} brow 失物浏览量
	 * @apiSuccess {Integer} isSolve 失物解决状态
	 * @apiSuccess {Integer} latitude 纬度
	 * @apiSuccess {Integer} longitude 经度
	 * @apiSuccess {Integer} messageId 物品分类
	 * @apiSuccess {String} gmtCreated 发布时间 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 * "code": "200",
	 * "message": null,
	 * "pageNo": 1,
	 * "pageSize": 20,
	 * "pageCount": 1,
	 * "recordCount": 2,
	 * "items": [
	 * 		{
     *       "id": 1,
     *       "title": "谁看到我的花色雨伞",
     *       "publisher": 0401160111,
     *       "foundPic": "http://www.ypc.edu.cn/yp/images/f1.png",
     *       "content": "本人丢了一把雨伞",
     *       "typeId": 1,
     *       "isExamine": 1,
     *       "brow": 0,
     *       "isSolve": 1,
     *       "gmtCreated": "2018-12-04 19:51:34.0",
     *       "latitude": 345,
     *       "longitude": 357,
     *       "messageId": 2
     *   },
     *   {
     *       "id": 2,
     *       "title": "U盘不见了，急急急",
     *       "publisher": 0401160111,
     *       "foundPic": "http://www.ypc.edu.cn/yp/images/f1.png",
     *       "content": "本人丢了一U盘",
     *       "typeId": 3,
     *       "isExamine": 2,
     *       "brow": 1,
     *       "isSolve": 1,
     *       "gmtCreated": "2018-12-04 19:51:34.0",
     *       "latitude": 357,
     *       "longitude": 347,
     *       "messageId": 2
     *   }   
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getLostList();
	
	/**
	 * @api {get} /lost/lostDetails/{id} 失物详情
	 * @apiName getLostDetails
	 * @apiGroup lost
	 * @apiVersion 0.0.1
	 * @apiDescription 失物详情
	 * 
	 * @apiParam {Long} id  失物id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} details 列表
	 * @apiSuccess {String} title 失物标题
	 * @apiSuccess {Integer} publisher 失物发布者id
	 * @apiSuccess {String} foundPic 失物图片
	 * @apiSuccess {String} content 失物内容
	 * @apiSuccess {Integer} typeId 失物分类id
	 * @apiSuccess {Integer} isExamine 失物审核状态
	 * @apiSuccess {Integer} brow 失物浏览量
	 * @apiSuccess {Integer} isSolve 失物解决状态
	 * @apiSuccess {Integer} latitude 纬度
	 * @apiSuccess {Integer} longitude 经度
	 * @apiSuccess {Integer} messageId 物品分类
	 * @apiSuccess {String} gmtCreated 发布时间 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 * "code": "200",
	 * "message": "",
	 * "items": [
	 * 		{
     *       "id": 1,
     *       "title": "谁看到我的花色雨伞",
     *       "publisher": 0401160111,
     *       "foundPic": "http://www.ypc.edu.cn/yp/images/f1.png",
     *       "content": "本人丢了一把雨伞",
     *       "typeId": 1,
     *       "isExamine": 1,
     *       "brow": 0,
     *       "isSolve": 1,
     *       "gmtCreated": "2018-12-04 19:51:34.0",
     *       "latitude": 345,
     *       "longitude": 357,
     *       "messageId": 2
     *   }
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getLostDetails();
	
	/**
	 * @api {get} /lost/lostMessage  获取失物分类信息
	 * @apiName getLostMessage
	 * @apiGroup lost
	 * @apiVersion 0.0.1
	 * @apiDescription  获取失物分类信息
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} lostTypeList 列表 
	 * @apiSuccess {Integer} typeId 分类id
	 * @apiSuccess {String} message 分类名
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 * "code": "200",
	 * "message": "",
	 * "lostTypeList": [
	 *     {
	 *         "typeId": 1,
	 *         "message": "失物"        
	 *     },       
	 *     {       
	 *         "typeId": 2, 
	 *         "message": "招领"         
	 *     }                 
	 *  ]                
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getLostMessage();
	
	
	/**
	 * @api {get} /lost/lostType  获取物品分类信息
	 * @apiName getLostType
	 * @apiGroup lost
	 * @apiVersion 0.0.1
	 * @apiDescription  获取物品分类信息
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} lostTypeList 列表 
	 * @apiSuccess {Integer} typeId 分类id
	 * @apiSuccess {String} typeName 物品名
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 * "code": "200",
	 * "message": "",
	 * "lostTypeList": [
	 *     {
	 *         "typeId": 1,
	 *         "typeName": "饭卡"        
	 *     },       
	 *     {       
	 *         "typeId": 2, 
	 *         "typeName": "身份证"         
	 *     }                 
	 *  ]                
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getLostType();
	
	
	
	/**
	 * @api {get} /lost/lostDelete/{id} 删除发布的记录
	 * @apiName getLostDelete
	 * @apiGroup lost
	 * @apiVersion 0.0.1
	 * @apiDescription 删除发布记录
	 * 
	 * @apiParam {Long} id  失物id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 *     "code": "200",
	 *     "message": "删除成功",
	 * }
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getLostDelete();
	
	
	/**
	 * @api {post} /lost/lostInput 录入失物信息
	 * @apiName setLostInput
	 * @apiGroup lost
	 * @apiVersion 0.0.1
	 * @apiDescription 录入失物信息
	 * 
	 * @apiParam {String} title  失物标题
	 * @apiParam {String} foundPic  失物图片
	 * @apiParam {String} content  详情
	 * @apiParam {Integer} typeId  失物分类id
	 * @apiParam {Integer} messageId  失物物品类别id
	 * @apiParam {Integer} latitude  纬度
	 * @apiParam {Integer} longitude  经度
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 *      "code": "200",
	 *      "message": "录入成功",
	 * }
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void setLostInput();
}
