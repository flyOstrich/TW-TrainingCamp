<template>
  <div class="signin">
    <el-form :model="form">
      <el-form-item label="用户名">
        <el-button slot="prepend" icon="el-icon-search"></el-button>
        <el-input v-model="form.username" placeholder="请输入用户名"></el-input>
      </el-form-item>
      <el-form-item label="密码">
        <el-button slot="prepend" icon="el-icon-search"></el-button>
        <el-input type="password" v-model="form.password" placeholder="请输入密码"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary">登录</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
export default {
  data() {
    return {
      form: {
        username: "",
        password: ""
      }
    };
  }
};
</script>
<style lang="less">
.signin {
  width: 40vw;
  min-width: 500px;
  margin: 200px auto;
}
</style>
