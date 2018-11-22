package api;
/**
*
* @Type UploadApi.java
* @Desc 元培小程序接口文档_校历模块
* @author zzc
* @date 2018年10月1日18:12:00
* @Version V1.0
*/
@Deprecated
public interface CalendarApi {
	/**
	 * @api {get} /calendar 校历
	 * @apiName getCanlendarUrl
	 * @apiGroup calendar
	 * @apiVersion 0.0.1
	 * @apiDescription 校历
	 * 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {String} calendar 校历图片地址
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
   	 * "code": "200",
     * "message": "",
     * "calendar":"",
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */	
	void getCanlendarUrl();
}
