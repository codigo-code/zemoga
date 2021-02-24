<template>
 <Loading
     :show="show"
     :label="label">
 </Loading>
  <section class="find">
    <input v-model="id" />
    <button
      class="btn btn-secondary my-2 my-sm-0"
      @click="onCLickSearch()"
      data-toggle="tooltip"
    >
      Get Profile
    </button>
  </section>

  <div class="row">
    <div class="column">
      <img :src="objCallback.imageUrl" width="200" height="200" />
    </div>

    <!-- fullname -->
    <div class="column">
      <div class="title">
        <h2>{{ objCallback.title }}</h2>
      </div>
      <div class="description">
        <h4>My Job Experience</h4>
        {{ objCallback.description }}
      </div>
    </div>
  </div>
</template>
<script>
// import axios from 'axios';
import Service from "@/services/Service";
import Loading from "vue-full-loading/src/Loading.vue";

export default {
  components: {
    Loading,
  },
  name: "profile",
  data() {
    return {
      objCallback: {},
      obj: Service,
      id: 0,
      show: false,
      label: "Loading...",
    };
  },
  methods: {
    title() {
      console.log("press");
    },
    onCLickSearch() {
        this.show=true;
      this.obj.getProfileById(this.id).then((data) => {
        console.log(data.data);
        this.objCallback = data.data;
        this.show=false;
      });
    },
  },
  mounted() {
    // this.obj.consumeProfile().then((data)=>{
    //     console.log(data.data);
    //     this.list = data.data;
    //     console.log(this.objCallback.title);
    // })
  },
};
</script>
<style scoped>
* {
  box-sizing: border-box;
}
.imgphoto {
  position: absolute;
  margin-left: -30em;
}

.starter-template {
  padding: 3rem 1.5rem;
  text-align: center;
}
.bd-placeholder-img {
  font-size: 1.125rem;
  text-anchor: middle;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}
@media (min-width: 768px) {
  .bd-placeholder-img-lg {
    font-size: 3.5rem;
  }

  .find {
    position: absolute;
    margin-left: 60em;
    margin-top: -3em;
  }
  .description {
    width: 32em;
    border: 1px solid;
    height: 100em;
    border-radius: 10px;
    padding: 1em;
    background-color: white;
  }
  /* .photo {
    float: left;
  } */
  .column {
    float: left;
    width: 40%;
    height: 300px; /* Should be removed. Only for demonstration */
  }

  /* Clear floats after the columns */
  .row:after {
    content: "";
    display: table;
    clear: both;
  }
}
</style>