package api;
@Deprecated
public interface LiveApi {
	/**
	 * @api {get} /live/getUrlList  得到生成的推流和播放地址列表
	 * @apiName getUrlList()
	 * @apiGroup live
	 * @apiVersion 0.0.1
	 * @apiDescription 得到生成的推流和播放地址列表
	 * 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} list
	 * @apiSuccess {int} list.id 
	 * @apiSuccess {String} list.title 消息说明
	 * @apiSuccess {int} list.status 地址状态 (0:关闭，1:开启) 
	 * @apiSuccess {String} list.playUrl 播放地址
	 * @apiSuccess {String} list.pushUrl 推流地址
	 * @apiSuccess {String} list.endTime 结束时间
	 * @apiSuccess {String} list.streamId 房间号
	 * @apiSuccess {String} list.gmtCreated 添加时间
	 * @apiSuccess {String} list.gmtModified 修改时间
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *	{
	 *    "code": "200",
	 *    "message": "",
	 *    "list": [
	 *        {
	 *            "id": 1,
	 *            "title": "感恩晚会现场直播",
	 *            "status": 1,
	 *            "pushUrl": "rtmp://39316.livepush.myqcloud.com/live/741977480?bizid=39316&txSecret=94d01e50db58baddeb956e9c90a38cdc&txTime=5C21FFA0",
	 *            "playUrl": "[\"http://abc.sxscott.com/live/741977480.m3u8\",\"http://abc.sxscott.com/live/741977480.fly\",\"rmtp://abc.sxscott.com/live/741977480\"",
	 *            "streamId": "741977480",
	 *            "endTime": "2018-12-25 18:00:00",
	 *            "gmtCreated": "2018-12-25 17:19:52",
	 *            "gmtModified": "2018-12-25 18:19:55"
	 *        }
	 *    ]
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * */
	void getUrlList();
	/**
	 * @api {post} /live/addPush  生成推流和播放地址
	 * @apiName addPushUrl
	 * @apiGroup live
	 * @apiVersion 0.0.1
	 * @apiDescription 生成推流和播放地址
	 * 
	 * @apiParam {String} title  标题
	 * @apiParam {String} domain  域名
	 * @apiParam {String} streamId 流id(房间号)
	 * @apiParam {String} txTime  有效时间（如 2018-12-25 18:00:00）
	 * @apiParam {Integer} status  状态 （0：关闭，1：开启）
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *	{
	 *    "code": "200",
	 *    "message": "",
	 *   
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * */
	void addPushUrl();
	
}
