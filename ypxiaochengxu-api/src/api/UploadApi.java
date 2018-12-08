package api;
/**
*
* @Type UploadApi.java
* @Desc 元培小程序接口文档_上传模块
* @author zzc
* @date 2018年10月1日18:12:00
* @Version V1.0
*/
@Deprecated
public interface UploadApi {
	
    /**
	 * @api {post} /upload/pic 上传图片通用接口（支持批量,非OSS）
	 * @apiName doUploadPic
	 * @apiGroup upload
	 * @apiVersion 0.0.1
	 * @apiDescription 上传图片通用接口（支持批量,非OSS）
	 * 
	 * @apiParam {File} files 图片文件
	 * @apiParam {String} picType 业务类型（vote,affairs,userLogin......）
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} urlList 图片路径
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
   	 * "code": "200",
     * "message": "",
     * "urlList": [
     *      "www.sxscott.com/crazyBirdimg/testtest/testtest_20181122185111004.jpg"
     *    
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
	void doUploadPic();
}
