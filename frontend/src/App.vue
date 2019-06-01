<template>
  <el-container>
    <nav>
      <el-button class="logout" type="text">logout</el-button>
    </nav>
    <el-main>
      <router-view></router-view>
    </el-main>
  </el-container>
</template>

<style lang="less">
nav {
  height: 50px;
  .logout {
    position: absolute;
    right: 20px;
    top: 5px;
  }
}
</style>
