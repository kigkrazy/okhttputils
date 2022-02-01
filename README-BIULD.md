# 编译说明

1. 在根目录增加`local.properties`文件，并输入如下信息

    ```
    sdk.dir=E:\\android_env\\sdk
    ```
   
2. 在`utils`目录下增加`gradle.properties`文件，并输入如下信息

    ```
    # 正式仓库信息，可以是云端仓库，可以是本地仓库
    mvnRepoUrl=file://D:\\publish_lib\\reizx-repo\\
    # 预发布仓库信息，可以是云端仓库，可以是本地仓库
    mvnSnapshotRepoUrl=file://D:\\publish_lib\\reizx-repo\\
    ```
3. 发布命令

    ```
    gradlew publish
    ```