<template>
  <div class="training-camp">
    <div class="summary-card" v-for="camp in camps" :key="camp['id']">
      <summary-card :thumbnail="camp['thumbnail']">
        <span>{{camp.name}}</span>
        <div>{{ camp.desc }}</div>
        <div>
          <el-button
            type="text"
            class="button"
            v-if="camp.signup"
            @click="$router.push('/task/1')"
          >查看任务卡>></el-button>
          <el-button
            type="text"
            class="button"
            v-if="!camp.signup"
            @click="$router.push('/apply/1')"
          >去报名>></el-button>
        </div>
      </summary-card>
    </div>
  </div>
</template>
<script>
import SummaryCard from "@/components/SummaryCard.vue";
export default {
  components: { SummaryCard },
  data() {
    return {
      camps: []
    };
  },
  async created() {
    let resp = await fetch("/mocks/training-camps.json");
    this.camps = await resp.json();
  }
};
</script>
<style lang="less">
.training-camp {
  width: 90vw;
  margin: 70px 0 0 70px;
  padding-bottom: 80px;
  display: flex;
  display: -webkit-flex;
  justify-content: flex-start;
  -webkit-justify-content: flex-start;
  flex-wrap: wrap;
  overflow: auto;
  .summary-card {
    margin: 25px;
  }
}
</style>
