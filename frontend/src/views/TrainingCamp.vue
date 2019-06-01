<template>
  <div class="trianing-camp">
    {{camps}}
    <div class="summary-card" v-for="camp in camps" :key="camp[id]">
      <summary-card :thumbnail="camp['thumbnail']">
        <span>camp.name</span>
        <div class="bottom clearfix">
          <time class="time">{{ camp.desc }}</time>
          <el-button type="text" class="button">操作按钮</el-button>
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
    console.log(this.camps);
  }
};
</script>
<style lang="less">
.training-camp {
  height: 90%;
  margin: 70px 0 0 70px;
  padding-bottom: 80px;
  display: flex;
  display: -webkit-flex;
  justify-content: flex-start;
  -webkit-justify-content: flex-start;
  flex-wrap: wrap;
  overflow: auto;
  .summary-card {
    margin: 10px;
  }
}
</style>
