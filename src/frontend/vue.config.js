const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer:{
    port: 3000
    // proxy:{
    //   '/users': {
    //     target: 'http://localhost:8090',
    //     ws: true,
    //     changeOrigin : true
    //   }
    // }
  }
})
