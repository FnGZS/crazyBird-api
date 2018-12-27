package api;

/**
*
* @Type WaibaoApi.java
* @Desc 元培小程序接口文档_waibao模块
* @author zhaojw
* @date 2018年10月1日18:12:00
* @Version V1.0
*/
@Deprecated
public interface WaibaoApi {

	/**
	 * @api {POST} /waibao/register 注册
	 * @apiName userRegister
	 * @apiGroup waibao
	 * @apiVersion 0.0.1
	 * @apiDescription 注册
	 * 
	 * @apiParam {String} userName 用户名
	 * @apiParam {String} password 密码
	 * @apiParam {String} email 邮箱
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 *  "code": "200",
	 *  "message": "注册成功"
	 *  }
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void userRegister();
	
	/**
	 * @api {POST} /waibao/login 登录
	 * @apiName userLogin
	 * @apiGroup waibao
	 * @apiVersion 0.0.1
	 * @apiDescription 登录
	 * 
	 * @apiParam {String} userName 用户名
	 * @apiParam {String} password 密码
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Long} id id
	 * @apiSuccess {String} headImg 用户名
	 * @apiSuccess {String} userName 用户头像 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 *   "code": "200",
     *   "message": "登录成功",
     *   "id": 1,
     *   "userName": "zzzqqq11",
     *   "headImg": "http://imgsrc.baidu.com/forum/w%3D580/sign=75e1e238bc3533faf5b6932698d3fdca/7b87f603738da977552bed1dbd51f8198618e393.jpg"
	 *  }
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
	 * @api {POST} /waibao/addProject 发包
	 * @apiName addProject
	 * @apiGroup waibao
	 * @apiVersion 0.0.1
	 * @apiDescription 发包
	 * 
	 * @apiParam {String} projectName 项目名
	 * @apiParam {String} projectContent 项目内容
	 * @apiParam {String} projectPoster 标题图片
	 * @apiParam {String} needs 专业需求
	 * @apiParam {String} skills 应用技能
	 * @apiParam {String} cycle 周期
	 * @apiParam {String} budget 预算
	 * @apiParam {Long} originator 发起人id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明 
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 *   "code": "200",
	 *   "message": "发包成功"
	 * }
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void addProject();
	
	/**
	 * @api {POST} /waibao/waibaoList 列表
	 * @apiName waibaoList
	 * @apiGroup waibao
	 * @apiVersion 0.0.1
	 * @apiDescription 列表
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} items 
	 * @apiSuccess {Long} item.id id
	 * @apiSuccess {String} item.projectName 项目名
	 * @apiSuccess {String} item.projectContent 项目内容
	 * @apiSuccess {String} item.projectPoster 标题图片
	 * @apiSuccess {String} item.needs 专业需求
	 * @apiSuccess {String} item.skills 应用技能
	 * @apiSuccess {String} item.cycle 周期
	 * @apiSuccess {String} item.budget 预算
	 * @apiSuccess {Long} item.originator 发起人id
	 * @apiSuccess {String} item.userName 发起人名字
	 * @apiSuccess {String} item.headImg 发起人头像
	 * @apiSuccess {String} item.gmtCreated 发布时间
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 * "code": "200",
	 *    "message": "",
	 *    "items": [
	 *        {
	 *            "id": 3,
	 *            "projectName": "疯鸟网络工作室",
	 *            "projectContent": "外包",
	 *            "projectPoster": "外包",
	 *            "needs": "123456",
	 *            "skills": "123456",
	 *            "cycle": "123456",
	 *            "budget": "123456",
	 *            "originator": 1,
	 *            "userName": "zzzqqq11",
	 *            "headImg": "http://imgsrc.baidu.com/forum/w%3D580/sign=75e1e238bc3533faf5b6932698d3fdca/7b87f603738da977552bed1dbd51f8198618e393.jpg",
	 *            "gmtCreated": "2018-12-26 01:28:58"
	 *        }
	 *    ]
	 * }
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getWaibaoList();
	
	/** 
	 * @api {GET} /waibao/details/{id} 详情
	 * @apiName getDetails
	 * @apiGroup waibao
	 * @apiVersion 0.0.1
	 * @apiDescription 详情
	 * 
	 * @apiParam {Long} id 项目id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Long} id id
	 * @apiSuccess {String} projectName 项目名
	 * @apiSuccess {String} projectContent 项目内容
	 * @apiSuccess {String} projectPoster 标题图片
	 * @apiSuccess {String} needs 专业需求
	 * @apiSuccess {String} skills 应用技能
	 * @apiSuccess {String} cycle 周期
	 * @apiSuccess {String} budget 预算
	 * @apiSuccess {Long} originator 发起人id
	 * @apiSuccess {String} userName 发起人名字
	 * @apiSuccess {String} headImg 发起人头像
	 * @apiSuccess {String} gmtCreated 发布时间
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *	    "code": "200",
	 *	    "message": "",
	 *	    "id": 3,
	 *	    "projectName": "疯鸟网络工作室",
	 *	    "projectContent": "外包",
	 *	    "projectPoster": "外包",
	 *	    "needs": "123456",
	 *	    "skills": "123456",
	 *	    "cycle": "123456",
	 *	    "budget": "123456",
	 *	    "originator": 1,
	 *	    "userName": "zzzqqq11",
	 *	    "headImg": "http://imgsrc.baidu.com/forum/w%3D580/sign=75e1e238bc3533faf5b6932698d3fdca/7b87f603738da977552bed1dbd51f8198618e393.jpg",
	 *	    "gmtCreated": "2018-12-26 01:28:58"
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getDetails();
	
	/**
	 * @api {GET} /waibao/sign 报名
	 * @apiName sign
	 * @apiGroup waibao
	 * @apiVersion 0.0.1
	 * @apiDescription 报名	
	 * 
	 * @apiParam {Long} userId 用户id
	 * @apiParam {Long} projectId 项目id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *    "code": "200",
	 *    "message": "报名成功"
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void sign();
	
	/**
	 * @api {GET} /waibao/signList/{projectId} 报名列表
	 * @apiName getSignList
	 * @apiGroup waibao
	 * @apiVersion 0.0.1
	 * @apiDescription 报名列表	
	 * 
	 * @apiParam {Long} projectId 项目id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} items
	 * @apiSuccess {Long} item.id id
	 * @apiSuccess {Long} item.projectId id
	 * @apiSuccess {Long} item.userId id
	 * @apiSuccess {String} item.userName id
	 * @apiSuccess {String} item.headImg id
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *		{
	 *		    "code": "200",
	 *		    "message": "",
	 *		    "items": [
	 *		        {
	 *		            "id": 1,
	 *		            "projectId": 3,
	 *		            "userId": 1,
	 *		            "userName": "zzzqqq11",
	 *		            "headImg": "http://imgsrc.baidu.com/forum/w%3D580/sign=75e1e238bc3533faf5b6932698d3fdca/7b87f603738da977552bed1dbd51f8198618e393.jpg"
	 *		        }
	 *		    ]
	 *		}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getSignList();
	
	/**
	 * @api {POST} /waibao/appointment 委任外包任务
	 * @apiName appointment
	 * @apiGroup waibao
	 * @apiVersion 0.0.1
	 * @apiDescription 委任外包任务	
	 * 
	 * @apiParam {Long} projectId 项目id
	 * @apiParam {Long} userId 用户id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *		{
	 *		    "code": "200",
	 *		    "message": "委派成功"
	 *		}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void appointment();
}
