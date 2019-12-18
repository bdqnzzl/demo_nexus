# test-hd-parent Maven多模块化项目结构

#### 项目介绍
Maven多模块项目,适用于一些比较大的项目，通过合理的模块拆分，实现代码的复用，便于维护和管理。尤其是一些开源框架，也是采用多模块的方式，提供插件集成，用户可以根据需要配置指定的模块
项目结构如下：

  　　　　test-hd-parent 　　(父级)
       　　　　  ---pom.xml
       　　　　  ---test-hd-api   　　　    (第三方接口层)
            　　　　　　  ----pom.xml    
    　　　　　  ---test-hd-foundation     (基础工具层)
            　　　　　　  ----pom.xml
       　　　　  ---test-hd-resource　    (资源层) 
              　　　　　　----pom.xml
       　　　　  ---test-hd-service  　　   (逻辑业务层)
            　　　　　　  ----pom.xml
    　　　　　  ---test-hd-modules  　　

#### 软件架构
软件架构说明


#### 安装教程

1. xxxx
2. xxxx
3. xxxx

#### 使用说明

1. xxxx
2. xxxx
3. xxxx

#### 参与贡献

1. Fork 本项目
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request


#### 码云特技

1. 使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2. 码云官方博客 [blog.gitee.com](https://blog.gitee.com)
3. 你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目
4. [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
5. 码云官方提供的使用手册 [http://git.mydoc.io/](http://git.mydoc.io/)
6. 码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)