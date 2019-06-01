import Vue from "vue";
import Router from "vue-router";
import SignIn from "@/views/SignIn.vue";
import TrainingCamp from "@/views/TrainingCamp.vue";

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: "/",
      name: "signin",
      component: SignIn
    },
    {
      path: "/training-camp",
      name: "training-camp",
      component: TrainingCamp
    }
  ]
});
