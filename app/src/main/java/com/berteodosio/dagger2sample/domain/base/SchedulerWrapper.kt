package com.berteodosio.dagger2sample.domain.base

import rx.Scheduler

class SubscribeSchedulerWrapper(val scheduler: Scheduler)

class ObserveSchedulerWrapper(val scheduler: Scheduler)