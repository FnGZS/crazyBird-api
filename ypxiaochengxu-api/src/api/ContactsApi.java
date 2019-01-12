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
	 * @apiSuccess {long} id 
	 * @apiSuccess {String} typeName 类型
	 * @apiSuccess {String} name 姓名
	 * @apiSuccess {String} phone 电话
	 * @apiSuccess {String} phone2 短号
	 * @apiSuccess {String} manger 业务
	 * @apiSuccess {String} pic 图片
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *   "code": "200",
	 *   "message": "",
	 *   "id": 1,
	 *   "typeName": "南区食堂三楼",
	 *   "name": "众利餐饮",
	 *   "phone": "13515757603",
	 *   "phone2": "667603",
	 *   "manger": "",
	 *   "pic": "[\"https://www.sxscott.com/crazyBirdimg/contacts/zhongli1\",\"https://www.sxscott.com/crazyBirdimg/contacts/zhongli2\"]"
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
	/**
	 * @api {get} /contacts/getContactsTypeList/{id}  获取某个类型列表
	 * @apiName getContactsTypeList
	 * @apiGroup contacts
	 * @apiVersion 0.0.1
	 * @apiDescription  获取某个类型列表
	 * 
	 * @apiParam {Long} id  
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} list  
	 * @apiSuccess {long} id 
	 * @apiSuccess {String} list.typeName 类型
	 * @apiSuccess {String} list.name 姓名
	 * @apiSuccess {String} list.phone 电话
	 * @apiSuccess {String} list.phone2 短号
	 * @apiSuccess {String} list.pic 图片
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *   "code": "200",
	 *   "message": "",
	 *   "list": [
	 *       {
	 *           "id": 8,
	 *           "typeName": "北区食堂三楼",
	 *           "name": "新昌炒年糕",
	 *           "phone": "17816537439 ",
	 *           "phone2": "587439",
	 *           "pic": "[\"https://www.sxscott.com/crazyBirdimg/contacts/xinchangniangao1.jpg\",\"https://www.sxscott.com/crazyBirdimg/contacts/xinchangniangao2.jpg\"]"
	 *       },
	 *       {
	 *           "id": 9,
	 *           "typeName": "北区食堂三楼",
	 *           "name": "黑泷堂",
	 *           "phone": "15805858893",
	 *           "phone2": "",
	 *           "pic": "[\"https://www.sxscott.com/crazyBirdimg/contacts/heilongtang1.jpg\",\"https://www.sxscott.com/crazyBirdimg/contacts/heilongtang2.jpg\"]"
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
	void getContactsTypeList();
}
