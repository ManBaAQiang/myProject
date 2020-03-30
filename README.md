profile：
    轻量级技术文章推荐+技术论坛，可做搜索，大数据处理投递push，文章可设权限等操作，论坛评论赞赏分享等功能。(后续需补充，初始idea)
整体架构及技术选型：

	前端先主做web,后续可根据情况开发app,h5,小程序等平台；技术选型：vue
	
	后端分为admin后台和主逻辑service,
	
	admin后台：使用AdminLTE搭建，
	
	service：spring boot、spring、mybatis，使用mysql数据库，缓存使用redis，
	
	static-task：创建一个静态工程项目，为了项目的健壮性及其用户体验，使用freemarker生成静态文件及访问高频数据存入缓存
	服务器：
	
相关sql数据语句、差异性文件	统一存放在material文件夹
数据模型使用power designer构建查看
