<template>
  <ul>
    <li>test</li>
<!--      <li class="list-group-item" v-for="user in msg" v-bind:key="user.id">{{user}}</li>-->
    <li v-for="user in allUsers" :key="user.id">
      <p> {{user.name}} </p>
    </li>
  </ul>
</template>
<script>

export default {
  name: 'GetAllUsers',
  data(){
    return {
      allUsers: []
    }
  },
  mounted: function () {
    const axios = require('axios').default;
    axios.get('http://localhost:8090/users')
        .then( response=> {
          // handle success
          this.allUsers = response.data.userList;
          console.log(response);
        })
        .catch(error=> {
          // handle error
          console.log(error);
        })
  }
}
</script>