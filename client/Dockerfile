FROM node:alpine

RUN mkdir -p /opt
WORKDIR /opt
COPY package.json .
RUN npm install --quiet
COPY . .
RUN npm run build
ENV NODE_ENV=production
ENV PATH /opt/node_modules/.bin:$PATH
CMD ["npm","run","serve"]