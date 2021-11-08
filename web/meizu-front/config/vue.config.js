// vue.config.js
const path = require('path')
module.exports = {
  pluginOptions: {
    'style-resources-loader': {
      preProcessor: 'scss',
      patterns: [
      // 这里假设你有 `src/variables.scss  src/scss/mixin.scss` 这两个文件
        path.resolve(__dirname,"./src/scss/variables.scss"),
        path.resolve(__dirname,"./src/scss/mixin.scss")
      ]
    }
  }
}