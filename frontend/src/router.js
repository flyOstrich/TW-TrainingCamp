import Vue from "vue";
import Router from "vue-router";
Vue.use(Router);

export default new Router({
  routes: [
    {
      path: "/",
      name: "signin",
      component: () => import("./views/SignIn.vue")
    },
    {
      path: "/apply/:id",
      name: "apply",
      component: () => import("./views/Apply.vue")
    },
    {
      path: "/task/:id",
      name: "task",
      component: () => import("./views/TaskList.vue")
    }
  ]
});
