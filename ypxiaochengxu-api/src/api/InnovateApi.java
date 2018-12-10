package api;
/**
*
* @Type InnovateApi.java
* @Desc 元培小程序接口文档_创业园模块
* @author zzc
* @date 2018年12月10日16:15:25
* @Version V1.0
*/
@Deprecated
public interface InnovateApi {
	/**
	 * @api {get} /innovate/list 得到企业列表
	 * @apiName getInnovateEnterpriseList
	 * @apiGroup innovate
	 * @apiVersion 0.0.1
	 * @apiDescription 得到企业列表
	 * 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} items
	 * @apiSuccess {int} items.id 企业id
	 * @apiSuccess {String} items.logo 企业logo
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
   	 * "code": "200",
     * "message": "",
     * "items":[
     * {
	 *		"id":1,
	 * 		"logo":"xxxxx.jpg"
     * 	}
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
	void getInnovateEnterpriseList();
	
	/**
	 * @api {get} /innovate/list/{id} 得到企业详情
	 * @apiName getInnovateEnterprise
	 * @apiGroup innovate
	 * @apiVersion 0.0.1
	 * @apiDescription 得到企业详情
	 * @apiParam {int} id 企业id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} id 企业id
	 * @apiSuccess {String} logo 企业logo
	 * @apiSuccess {String} name 企业名称
	 * @apiSuccess {String} content 企业展示内容
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
   	 * "code": "200",
     * "message": "",
     * "id":1,
     * "logo":"xxxxx.jpg",
     * "name":"疯鸟网络工作室",
     * "content":"123123"
     * }
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */	
	void getInnovateEnterprise();
}
