package api;
/**
*
* @Type HelpApi.java
* @Desc 元培小程序接口文档_帮助模块
* @author wb
* @date 2018年12月10日16:15:25
* @Version V1.0
*/
@Deprecated
public interface HelpApi {
	/**
	 * @api {get} /help/gethelp 帮助
	 * @apiName getHelp
	 * @apiGroup help
	 * @apiVersion 0.0.1
	 * @apiDescription 帮助
	 * 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} items
	 * @apiSuccess {int} items.title 问题标题
	 * @apiSuccess {String} items.content 问题解决方案
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
   	 * "code": "200",
     * "message": "",
     * "items":[
     * {
	 *		"title":"登陆不了怎么回事",
	 * 		"content":"怎么办我怎么知道?，还不是因为你人丑"
     * 	}
     * ]
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 */	
	 void getHelp();
}
