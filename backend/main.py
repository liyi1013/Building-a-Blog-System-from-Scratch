from typing import Any, Optional

from fastapi import FastAPI
from fastapi.middleware.cors import CORSMiddleware
from starlette.responses import JSONResponse

app: FastAPI = FastAPI(title="Building-a-Blog-System-from-Scratch")

# 配置CORS允许的来源
origins = [
    "http://localhost:3000",  # 添加你自己的来源
    "http://example.com",     # 添加你自己的来源
]

app.add_middleware(
    CORSMiddleware,
    allow_origins=origins,
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

# 定义GET路由
@app.get("/")
async def read_root():
    """返回应用程序的欢迎信息"""
    return JSONResponse({"message": "Welcome to my FastAPI application!"})

# 运行应用
if __name__ == "__main__":
    import uvicorn
    uvicorn.run(app, host="127.0.0.1", port=8000, reload=True)