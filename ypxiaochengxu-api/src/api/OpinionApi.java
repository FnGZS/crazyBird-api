package api;
/**
*
* @Type UserLogin.java
* @Desc 元培小程序接口文档_建议模块
* @author zhaojw
* @date 2018年11月21日2:12:00
* @Version V1.0
*/
@Deprecated
public class OpinionApi {
	/**
	 * @api {post} /opinion/creat  添加意见信息
	 * @apiName creat
	 * @apiGroup opinion
	 * @apiVersion 0.0.1
	 * @apiDescription 添加意见信息
	 * 
	 * @apiParam {String} proposal 建议
	 * @apiParam {String} phone 电话
	 * @apiParam {String} wxid 微信号
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
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
}
