<template>
  <div class="signin">
    <el-form :model="form" :rules="rules" ref="form">
      <el-form-item label="用户名" prop="username">
        <el-button slot="prepend" icon="el-icon-search"></el-button>
        <el-input v-model="form.username" placeholder="请输入用户名"></el-input>
      </el-form-item>
      <el-form-item label="密码" prop="password">
        <el-button slot="prepend" icon="el-icon-search"></el-button>
        <el-input type="password" v-model="form.password" placeholder="请输入密码"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" class="signin-btn" @click="signin()">登录</el-button>
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
      },
      rules: {
        username: [
          { required: true, trigger: "blur", message: "请输入用户名！" },
          { maxlen: 30, trigger: "blur", message: "不能超过30个字符！" }
        ],
        password: [
          { required: true, trigger: "blur", message: "请输入密码！" },
          { maxlen: 30, trigger: "blur", message: "不能超过30个字符！" }
        ]
      }
    };
  },
  methods: {
    async signin() {
      try {
        await this.$refs.form.validate();
        await fetch();
      } catch (err) {
        console.error(err);
      }
    }
  }
};
</script>
<style lang="less">
.signin {
  width: 40vw;
  min-width: 500px;
  margin: 200px auto;
}
.signin-btn {
  width: 100%;
  margin-top: 20px;
}
</style>
