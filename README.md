<div align="center">

# ☕ Java Infra

**Java 技术学习记录仓库**

记录 Java 新特性 · Spring 生态 · 分布式中间件 · 后端基础设施

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![Java](https://img.shields.io/badge/Java-8~25-orange?logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](https://github.com/lynx009/java-infra/pulls)
[![Stars](https://img.shields.io/github/stars/lynx009/java-infra?style=social)](https://github.com/lynx009/java-infra/stargazers)

</div>

---

## 📖 简介

这是一个持续更新的 Java 技术学习笔记仓库，涵盖从 Java 语言新特性到企业级后端架构的方方面面。每一份笔记都力求结合**原理解析 + 代码示例 + 最佳实践**，帮助自己（也希望帮助你）系统地掌握 Java 后端技术栈。

> 📌 **学习路径**：Java 基础 → Java 新特性 → Spring 生态 → 分布式中间件 → 高并发 & 高可用

---

## 📚 内容目录

### ☕ Java 新特性

| 版本 | 主要特性 | 状态 |
|------|---------|------|
| Java 8  | Lambda、Stream API、Optional、新日期 API | 📝 整理中 |
| Java 11 | HTTP Client、var 局部变量类型推断、模块系统 | 📝 整理中 |
| Java 17 | Sealed Classes、Record、Pattern Matching | 📝 整理中 |
| Java 21 | Virtual Threads（虚拟线程）、Sequenced Collections | 📝 整理中 |
| Java 25 | XXX | 📝 整理中 |

### 🌱 Spring 生态

| 模块 | 描述 | 状态 |
|------|------|------|
| Spring Core | IoC / DI 原理、Bean 生命周期、AOP | 📝 整理中 |
| Spring Boot | 自动装配原理、Actuator、配置管理 | 📝 整理中 |
| Spring MVC | DispatcherServlet 流程、拦截器、异常处理 | 📝 整理中 |
| Spring Security | 认证与授权、JWT、OAuth2 | 📝 整理中 |
| Spring Cloud | 服务注册/发现、配置中心、网关 | 📝 整理中 |

### 🔗 分布式中间件

| 中间件 | 描述 | 状态 |
|--------|------|------|
| Dubbo | RPC 原理、服务治理、扩展 SPI 机制 | 📝 整理中 |
| MyBatis | SQL 映射、插件机制、一二级缓存 | 📝 整理中 |
| Redis | 数据结构、持久化、集群、分布式锁 | 📝 整理中 |
| Kafka | 消息队列原理、消费者组、高可用 | 📝 整理中 |
| Elasticsearch | 倒排索引、分词、聚合查询 | 📝 整理中 |
| MySQL | 索引优化、事务隔离、主从复制 | 📝 整理中 |

### 🏗️ 系统设计 & 架构

| 主题 | 描述 | 状态 |
|------|------|------|
| 微服务架构 | 服务拆分、通信、容错设计 | 📝 整理中 |
| 分布式事务 | 2PC / TCC / Saga / Seata | 📝 整理中 |
| 高并发设计 | 限流、熔断、降级、缓存策略 | 📝 整理中 |
| 设计模式 | 常用设计模式在 Java 中的应用 | 📝 整理中 |

---

## 🗂️ 目录结构

```
java-infra/
├── java-features/          # Java 各版本新特性
│   ├── java8/
│   ├── java11/
│   ├── java17/
│   └── java21/
├── spring/                 # Spring 全家桶
│   ├── spring-core/
│   ├── spring-boot/
│   ├── spring-mvc/
│   ├── spring-security/
│   └── spring-cloud/
├── middleware/             # 分布式中间件
│   ├── dubbo/
│   ├── redis/
│   ├── kafka/
│   ├── elasticsearch/
│   └── mysql/
├── architecture/           # 系统设计 & 架构
│   ├── microservices/
│   ├── distributed/
│   └── patterns/
└── README.md
```

---

## 🚀 快速开始

本仓库以**笔记 + 可运行代码示例**的形式呈现，每个模块均可独立运行。

```bash
# 克隆仓库
git clone https://github.com/lynx009/java-infra.git
cd java-infra

# 进入感兴趣的模块，使用 Maven 构建
cd spring/spring-boot
mvn clean package -DskipTests
```

> **环境要求**：JDK 17+（如需运行 Java 21 虚拟线程等示例，请使用 JDK 21+），Maven 3.8+

---

## 🤝 贡献

欢迎任何形式的贡献！如果你发现错误、有更好的示例，或想补充某个主题：

1. Fork 本仓库
2. 创建特性分支 (`git checkout -b feature/add-xxx-notes`)
3. 提交更改 (`git commit -m 'docs: add xxx notes'`)
4. 推送到分支 (`git push origin feature/add-xxx-notes`)
5. 提交 Pull Request

---

## 📄 许可证

本项目基于 [MIT License](LICENSE) 开源，欢迎学习与引用，转载请注明出处。

---

<div align="center">

⭐ 如果这个仓库对你有帮助，欢迎 Star 支持一下！

*持续更新中 · Continuously Updated*

</div>
