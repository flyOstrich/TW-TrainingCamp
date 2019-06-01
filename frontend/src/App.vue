<template>
  <el-container>
    <header>
      <div class="logo">TW-TrainingCamp</div>
      <el-button class="logout" type="text">logout</el-button>
    </header>
    <el-main>
      <router-view></router-view>
    </el-main>
  </el-container>
</template>

<style lang="less">
header {
  height: 50px;
  position: fixed;
  background: #2c2929;
  top: 0;
  left: 0;
  width: 100%;
  .logout {
    position: absolute;
    right: 20px;
    top: 5px;
  }
  .logo {
    font-size: 20px;
    font-weight: bold;
    color: white;
    margin-top: 10px;
    margin-left: 10px;
  }
}
</style>
