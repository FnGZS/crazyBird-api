package api;
/**
*
* @Type UserLogin.java
* @Desc 元培小程序接口文档_登录模块
* @author zhaojw
* @date 2018年10月1日18:12:00
* @Version V1.0
*/
@Deprecated
public interface UserLoignApi {
	/**
	 * @api {post} /user/login 获得微信小程序第三方登录
	 * @apiName userLogin
	 * @apiGroup user
	 * @apiVersion 0.0.1
	 * @apiDescription 获得微信小程序第三方登录
	 * 
	 * @apiParam {String} platCode  小程序微信公共登录时返回的code
	 * @apiParam {String} platUserInfoMap  信息数据包
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {String} userName 用户名
	 * @apiSuccess {String} authorization 登录态
	 * @apiSuccess {int} sex 性别
	 * @apiSuccess {String} openAccount 用户名
	 * @apiSuccess {int} isbound 是否绑定 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 * "code": "200",
	 * "message": "",
	 * "userName": "Effort",
	 * "authorization": "ojime4rpVaRSueHI6yr5Y-zRYbf4",
	 * "sex": "1",
	 * "openAccount": "Effort",
	 * "isbound":"2"
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void userLogin();
	
	
	/**
	 * @api {post} /user/binding 绑定学号
	 * @apiName userBinding
	 * @apiGroup user
	 * @apiVersion 0.0.1
	 * @apiDescription 绑定学号
	 * 
	 * @apiParam {Long} schoolNum  学号
	 * @apiParam {String} password  密码
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Integer} result 登录后是否绑定的状态
	 * @apiSuccess {String} asToken 绑定后的登录态
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 * "code": "200",
	 * "message": "绑定成功",
	 * "asToken": "GCUX8pVPpHwDCR7cKKvhKiQbVh0cXxQq8XTCJUv/BEFgFiDqut0rfZrXLz3hbwys",
	 * "result":"1"
	 * } 
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * */
	void userBinding();
}
