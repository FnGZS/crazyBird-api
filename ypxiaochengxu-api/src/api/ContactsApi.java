package api;

/**
*
* @Type ContactsApi.java
* @Desc 元培小程序接口文档_通讯录模块
* @author wb
* @date 2019年1月11日16:00:00
* @Version V1.0
*/

@Deprecated
public interface ContactsApi {
	
	/**
	 * @api {get} /contacts/getContactsType  获取通讯类型
	 * @apiName getContactsType
	 * @apiGroup contacts
	 * @apiVersion 0.0.1
	 * @apiDescription  获取通讯类型
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} contactsTypeList  
	 * @apiSuccess {long} id 
	 * @apiSuccess {String} typeName 通讯类型
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *   "code": "200",
	 *   "message": "",
	 *   "contactsTypeList": [
	 *       {
	 *           "id": 1,
	 *           "typeName": "南区食堂三楼"
	 *       },
	 *       {
	 *           "id": 2,
	 *           "typeName": "北区食堂三楼"
	 *       },
	 *       {
	 *           "id": 3,
	 *           "typeName": "创新创业学院"
	 *       },
	 *       {
	 *           "id": 4,
	 *           "typeName": "校内常用热线"
	 *       }
	 *   ]
	 *}               
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getContactsType();
	
	/**
	 * @api {get} /contacts/getContactsDetail/{id}  获取通讯详情
	 * @apiName getContactsDetail
	 * @apiGroup contacts
	 * @apiVersion 0.0.1
	 * @apiDescription  获取通讯详情
	 * 
	 * @apiParam {Long} id  
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} details  
	 * @apiSuccess {long} id 
	 * @apiSuccess {String} name 姓名
	 * @apiSuccess {String} phone 电话
	 * @apiSuccess {String} phone2 短号
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *   "code": "200",
	 *   "message": "",
	 *   "pageNo": 0,
	 *   "pageSize": 0,
	 *   "pageCount": 0,
	 *   "recordCount": 0,
	 *   "details": [
	 *       {
	 *           "id": 1,
	 *           "name": "鸡柳数薯条奶昂",
	 *           "phone": "15857542186",
	 *           "phone2": "213"
	 *       }
	 *   ]
	 *}            
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getContactsDetail();
}
