import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

//导入element-plus框架和css样式
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

//导入自定义样式
import('@/assets/global.css')

//导入element-plus语言模式（中文），规范框架语言
import zhCn from 'element-plus/es/locale/lang/zh-cn'
//导入element-plus的图标
import * as ElementPlusIconsVue from '@element-plus/icons-vue'

const app = createApp(App)

app.use(router)

//app使用element-plus框架
app.use(ElementPlus,{
    locale:zhCn,
})

//注册所有图标
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}

app.mount('#app')
