const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  outputDir: "../src/main/resources/static",  // 빌드 타겟 디렉토리
  devServer: {
    proxy: {
      '/res': {
        // '/api' 로 들어오면 포트 8081(스프링 서버)로 보낸다
        target: 'http://localhost:8080', //개발용
        changeOrigin: true // cross origin 허용
      }
    }
  },
  transpileDependencies: true
})



